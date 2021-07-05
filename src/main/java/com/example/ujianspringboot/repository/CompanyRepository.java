package com.example.ujianspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ujianspringboot.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
