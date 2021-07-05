package com.example.ujianspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianspringboot.entity.CompanyBudget;
import com.example.ujianspringboot.repository.CompanyBudgetRepository;

@Service
public class CompanyBudgetService {
	
	@Autowired
	private CompanyBudgetRepository companyBudgetRepository;
	
	public CompanyBudget saveCompanyBudget(CompanyBudget companyBudget) {
		return companyBudgetRepository.save(companyBudget);
	}

	public List<CompanyBudget> saveCompanyBudgets(List<CompanyBudget> companyBudgets) {
		// TODO Auto-generated method stub
		return companyBudgetRepository.saveAll(companyBudgets);
	}

	public List<CompanyBudget> getCompanyBudgetByCbamountMinus() {
		// TODO Auto-generated method stub
		return (List<CompanyBudget>) companyBudgetRepository.FindByCbamountMinus();
	}

	public List<CompanyBudget> getCompanyBudgetByCbamountLebihDari5Juta() {
		// TODO Auto-generated method stub
		return (List<CompanyBudget>) companyBudgetRepository.FindByCbamountLebihDari5Juta();
	}

}
