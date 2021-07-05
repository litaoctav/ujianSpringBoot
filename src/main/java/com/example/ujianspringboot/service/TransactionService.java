package com.example.ujianspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianspringboot.entity.Transaction;
import com.example.ujianspringboot.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	public Transaction saveTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	public List<Transaction> saveTransactions(List<Transaction> transactions) {
		// TODO Auto-generated method stub
		return transactionRepository.saveAll(transactions);
	}

	public List<Transaction> getTransactionByType(String type) {
		// TODO Auto-generated method stub
		return (List<Transaction>) transactionRepository.findByType(type);
	}

}
