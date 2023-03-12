package com.piotrmucha.manning.project.service;

import com.piotrmucha.manning.project.data.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    private TransactionService transactionService;

    @BeforeEach
    void setUp() {
        transactionService = new TransactionService();
    }

    @Test
    void expectThreeTransactions() {
        List<Transaction> transactions = transactionService.findAllByAccountNumber("123");
        assertEquals(transactions.size(), 3);
    }

}