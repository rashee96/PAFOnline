package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.BuyingDAO;
import com.model.Buying;

@RestController
@RequestMapping("/company")
public class BuyingController {
	
	@Autowired
	BuyingDAO buyingdao;
	
	@PostMapping("/buying")
	public Buying createBuying(@Valid @RequestBody Buying buying) {
		return buyingdao.save(buying);
	}
	
	@GetMapping("/buying")
	public List<Buying> getAllBuying(){
		return buyingdao.findAll();
	}
	
	@GetMapping("/buying/{id}")
	public ResponseEntity<Buying> getBuyingById(@PathVariable(value="id")Long id){
		Buying buying = buyingdao.findOne(id);
		
		if(buying == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok().build();
	}
	
	
	

}
