package com.apsidiscount.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apsidiscount.entity.Constructeur;
import com.apsidiscount.service.ConstructorService;

@RestController
public class ConstructorRestController {
	@Autowired
	private ConstructorService constructorService;
	
	//Ajout 21/7
	@GetMapping(produces = "application/json", path="/api/allmanufacturer")
	public List<Constructeur> getAllConstruct() {
	return  constructorService.getAllConstructors();
	}
}
