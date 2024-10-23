package io.better_banking.ob_1_define_the_contract.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.better_banking.ob_1_define_the_contract.models.dto.Transaction;



@SpringBootTest
public class TransactionServiceTests {

    @Autowired
    private TransactionService transactionService;

    @Test
    public void testFindAllByAccountNumber() {

        String accountNumber = "111111111";

       List<Transaction> transactions = transactionService.findAllByAccountNumber(accountNumber);
        //Transaction Transactions = transactionService.findAllByAccountNumber(accountNumber);

        assertEquals(5, transactions.size(), "Se esperaba que la lista contuviera entre 3 y 5 transacciones");

        
    }

}
