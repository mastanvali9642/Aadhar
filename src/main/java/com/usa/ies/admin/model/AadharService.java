package com.usa.ies.admin.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AadharService {
	
	
	@Autowired
	RestTemplate restTemplate;
	
public Aahdar getAadharInfo(int no) {
	System.out.println("hello");
	return restTemplate.getForObject("http://localhost:6326/adhar/adhar/{no}", Aahdar.class,no);
		
	}

}
