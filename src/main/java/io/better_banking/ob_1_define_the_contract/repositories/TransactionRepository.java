package io.better_banking.ob_1_define_the_contract.repositories;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import io.better_banking.ob_1_define_the_contract.models.dto.Transaction;

@Repository
public class TransactionRepository {

    private List<Transaction> data;

    public TransactionRepository() {

        this.data = Arrays.asList(
            new Transaction("transfer", new Date(), "111111111", "USD", 100L, "companyA","http://imagecompanyA"),
            new Transaction("mortgage", new Date(), "111111111", "USD", 10000L, "companyB", "http://imagecompanyB"),
            new Transaction("payment", new Date(), "111111111", "USD", 250L, "companyC", "http://imagecompanyC"),
            new Transaction("payment", new Date(), "111111111", "USD", 50L, "companyD", "http://imagecompanyD"),
            new Transaction("transfer", new Date(), "111111111", "USD", 300L, "companyE", "http://imagecompanyE")
        );
    }

  
    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        return data.stream().filter(p -> p.getAccountNumber().equals(accountNumber)).collect(Collectors.toList());
    }

}
