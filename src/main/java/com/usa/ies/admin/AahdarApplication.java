package com.usa.ies.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.usa.ies.admin.model.AadharService;
import com.usa.ies.admin.model.Aahdar;

@SpringBootApplication
public class AahdarApplication {

	public static void main(String[] args) {
ConfigurableApplicationContext ap=		SpringApplication.run(AahdarApplication.class, args);
AadharService service=(AadharService)ap.getBean("aadharService");
Aahdar a=    service.getAadharInfo(225);
System.out.println(a.getAdharno()+","+a.getAddress()+","+a.getSex());
		
	}
	
	
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
