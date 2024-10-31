package io.better_banking.ob_1_define_the_contract.services;

import java.util.List;

import org.springframework.stereotype.Service;

import io.better_banking.ob_1_define_the_contract.models.dto.Transaction;
import io.better_banking.ob_1_define_the_contract.repositories.TransactionRepository;



@Service
public class TransactionService {

    private TransactionRepository repository;

    // Constructor
    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    
    public List<Transaction> findAllByAccountNumber(String accountNumber){
        return repository.findAllByAccountNumber(accountNumber);
    }   

    

}
