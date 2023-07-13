package com.ets.controller;

import com.ets.model.Transaction;
import com.ets.model.TransactionMode;
import com.ets.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chaitanya Kher
 * @created 09/07/2023 - 17:47
 * @project expense-tracker
 */

@RestController
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insert() {
        List<Transaction> transactions = new ArrayList<Transaction>();
        transactions.add(new Transaction("Salary", LocalDate.now(ZoneId.of("Asia/Kolkata")), 2123.21, TransactionMode.CREDIT));
        transactions.add(new Transaction("Rent", LocalDate.now(ZoneId.of("America/Montreal")), 231321, TransactionMode.DEBIT));
        transactionRepository.saveAll(transactions);
    }

    @RequestMapping(value = "/clear-table", method = RequestMethod.DELETE)
    public void deleteAll() {
        transactionRepository.deleteAll();
    }
}
