package com.ets.repository;

import com.ets.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Chaitanya Kher
 * @created 09/07/2023 - 17:45
 * @project expense-tracker
 */
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
