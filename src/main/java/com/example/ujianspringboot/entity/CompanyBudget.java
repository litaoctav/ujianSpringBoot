package com.example.ujianspringboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "company_budget")
public class CompanyBudget {
	
	@Id
	@GeneratedValue
	private int cb_id;
	private int company_id;
	private int cb_amount;
	
	public int getCb_id() {
		return cb_id;
	}
	public void setCb_id(int cb_id) {
		this.cb_id = cb_id;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public int getCb_amount() {
		return cb_amount;
	}
	public void setCb(int cb_amount) {
		this.cb_amount = cb_amount;
	}
	
}
