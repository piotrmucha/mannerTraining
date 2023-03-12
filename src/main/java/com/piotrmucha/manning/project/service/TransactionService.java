package com.piotrmucha.manning.project.service;

import com.piotrmucha.manning.project.data.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        return List.of(new Transaction(accountNumber, LocalDate.of(2, 2, 2), "s", "2", BigDecimal.valueOf(20), "a", "b"),
                new Transaction(accountNumber, LocalDate.of(2, 2, 2), "s", "2", BigDecimal.valueOf(20), "a", "b"),
                new Transaction(accountNumber, LocalDate.of(2, 2, 2), "s", "2", BigDecimal.valueOf(20), "a", "b"));
    }

}
