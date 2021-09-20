package de.tekup.first.project.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.first.project.services.CalculatServiceImpl;

@RestController
public class CalculatorCtrl {
	
	private CalculatServiceImpl service;
	
	public CalculatorCtrl(CalculatServiceImpl service) {
		super();
		this.service = service;
	}



	@RequestMapping(path = "/add/{a}/{b}")
	public int executeAdd(@PathVariable("a") int a,@PathVariable("b") int b) {
		return service.sum(a, b);
	}

}
