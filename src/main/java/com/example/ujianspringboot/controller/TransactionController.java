package com.example.ujianspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringboot.entity.Transaction;
import com.example.ujianspringboot.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping ("/addTransaction")
	public Transaction addTransaction (@RequestBody Transaction transaction) {
		return transactionService.saveTransaction(transaction);
		
	}
	@PostMapping("/addTransactions")
	public List<Transaction> addTransactions(@RequestBody List<Transaction> transactions){
		return transactionService.saveTransactions(transactions);
	}
	@GetMapping("/getTransactionByType/{type}")
	public List<Transaction> findByType(@PathVariable String type){
		return transactionService.getTransactionByType(type);
	}

}
