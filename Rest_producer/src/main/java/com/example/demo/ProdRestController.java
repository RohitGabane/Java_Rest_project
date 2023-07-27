package com.example.demo;

import jakarta.servlet.http.*;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

	  
	@RestController  
	public class ProdRestController 
	{  
		
		@GetMapping(value = "/GetAllProds", produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})  
	 public Product disp(HttpServletRequest request,HttpServletResponse response) 
	{ 
		 Product p1=new Product(1,"soap","cosmetics",100,60);
		 return p1;
	 }  
	
		
	}
