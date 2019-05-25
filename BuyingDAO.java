package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Buying;
import com.repository.BuyingRepository;

@Service
public class BuyingDAO {
	@Autowired
	BuyingRepository buyingRepository;
	
	public Buying save(Buying buying) {
		return buyingRepository.save(buying);
	}
	
	public List<Buying>findAll(){
		return buyingRepository.findAll();
	}
	
	public Buying findOne(Long id) {
		return buyingRepository.findOne(id);
	}
	
	public void delete(Buying buying) {
		buyingRepository.delete(buying);
	}

}
	