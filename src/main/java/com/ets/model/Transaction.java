package com.ets.model;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * @author Chaitanya Kher
 * @created 09/07/2023 - 15:43
 * @project Defines the contents of a transaction
 */

@Entity
@Table
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String transactionReason;
    private LocalDate created_at;
    private double amount;

    private TransactionMode transactionMode;

    public Transaction() {

    }

    public Transaction(String transactionReason, LocalDate created_at, double amount, TransactionMode transactionMode) {
        this.transactionReason = transactionReason;
        this.created_at = created_at;
        this.amount = amount;
        this.transactionMode = transactionMode;
    }

    public Long getId() {
        return id;
    }

    public String getTransactionReason() {
        return transactionReason;
    }

    public void setTransactionReason(String transactionReason) {
        this.transactionReason = transactionReason;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionMode getTransactionMode() {
        return transactionMode;
    }

    public void setTransactionMode(TransactionMode transactionMode) {
        this.transactionMode = transactionMode;
    }
}
