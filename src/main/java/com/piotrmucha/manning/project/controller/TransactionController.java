package com.piotrmucha.manning.project.controller;


import com.piotrmucha.manning.project.data.Transaction;
import com.piotrmucha.manning.project.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/{accountNumber}")
    public List<Transaction> transactions(@PathVariable final Integer accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }
}
