package de.tekup.first.project.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatServiceImpl {
	
	public int sum(int a, int b) {
		return a+b;
	}

}
