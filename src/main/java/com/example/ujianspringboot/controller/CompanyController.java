package com.example.ujianspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianspringboot.entity.Company;
import com.example.ujianspringboot.service.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/addCompany")
	public Company addCompany (@RequestBody Company company) {
		return companyService.saveCompany(company);
	}
	@PostMapping("/addCompanies")
	public List<Company> addCompanies(@RequestBody List<Company> companies){
		return companyService.saveCompanies(companies);
	}
}
