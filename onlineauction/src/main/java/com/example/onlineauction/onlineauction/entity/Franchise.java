package com.example.onlineauction.onlineauction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Franchise {
	
	@Id
	private Integer franchiseId;
	
	@Column(length = 15)
	private String franchiseName;

	public Integer getFranchiseId() {
		return franchiseId;
	}

	public void setFranchiseId(Integer franchiseId) {
		this.franchiseId = franchiseId;
	}

	public String getFranchiseName() {
		return franchiseName;
	}

	public void setFranchiseName(String franchiseName) {
		this.franchiseName = franchiseName;
	}

	

	
	

	

	
	
	
}
