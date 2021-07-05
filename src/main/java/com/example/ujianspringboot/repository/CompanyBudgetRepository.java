package com.example.ujianspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ujianspringboot.entity.CompanyBudget;

@Repository
public interface CompanyBudgetRepository extends JpaRepository<CompanyBudget, Integer>{

	@Query (value = "Select * FROM company_budget WHERE cb_amount < 0", nativeQuery = true )
	List<CompanyBudget> FindByCbamountMinus();
	
	@Query (value = "Select * FROM company_budget WHERE cb_amount > 5000000", nativeQuery = true)

	List<CompanyBudget> FindByCbamountLebihDari5Juta();
}
