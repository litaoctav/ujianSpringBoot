package com.example.ujianspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringboot.entity.CompanyBudget;
import com.example.ujianspringboot.service.CompanyBudgetService;

@RestController
public class CompanyBudgetController {
	
	@Autowired
	private CompanyBudgetService companyBudgetService;
	
	@PostMapping("/addCompanyBudget")
	public CompanyBudget addCompanyBudget (@RequestBody CompanyBudget companyBudget) {
		return companyBudgetService.saveCompanyBudget(companyBudget);
	}
	
	@PostMapping("/addCompanyBudgets")
	public List<CompanyBudget> addCompanyBudgets(@RequestBody List<CompanyBudget> companyBudgets){
		return companyBudgetService.saveCompanyBudgets(companyBudgets);
	}
	
	@GetMapping ("/getCompanyBudgetByCbamountMinus")
	public List<CompanyBudget> findByCbamountMinus () {
		return companyBudgetService.getCompanyBudgetByCbamountMinus();
	}
	
	@GetMapping ("/getCompanyBudgetByCbamountLebihDari5Juta")
	public List<CompanyBudget> findByCbamountLebihDari5Juta () {
		return companyBudgetService.getCompanyBudgetByCbamountLebihDari5Juta();
	}
}
