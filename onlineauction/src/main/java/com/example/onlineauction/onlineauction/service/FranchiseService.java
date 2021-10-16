package com.example.onlineauction.onlineauction.service;

import java.util.List;

import com.example.onlineauction.onlineauction.entity.Franchise;

public interface FranchiseService {
	
	public void addFranchise(Franchise franchise);
	public void deleteFranchise(Franchise franchise);
	public List<Franchise> getAllFranchise();
	public Franchise updateFranchise(Franchise franchise);
	public Franchise getFranchiseById(Integer id);
}
                                                