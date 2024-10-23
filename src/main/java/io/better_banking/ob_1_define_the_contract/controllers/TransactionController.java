package io.better_banking.ob_1_define_the_contract.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.better_banking.ob_1_define_the_contract.models.dto.Transaction;
import io.better_banking.ob_1_define_the_contract.services.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @GetMapping("/{accountNumber}")
    public List<Transaction> show(@PathVariable String accountNumber){
        return service.findAllByAccountNumber(accountNumber);
    }

}
