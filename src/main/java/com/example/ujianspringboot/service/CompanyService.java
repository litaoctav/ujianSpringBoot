package com.example.ujianspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianspringboot.entity.Company;
import com.example.ujianspringboot.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}

	public List<Company> saveCompanies(List<Company> companies) {
		// TODO Auto-generated method stub
		return companyRepository.saveAll(companies);
	}
	
	

}
