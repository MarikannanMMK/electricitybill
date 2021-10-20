package com.example.demo.BillingService.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BillingService.entity.Billing;
import com.example.demo.BillingService.entity.UserRequest;
import com.example.demo.BillingService.entity.UserResponse;
import com.example.demo.BillingService.service.BillingService;


@RestController
@RequestMapping("/bills")
public class BillingController {
	
	@Autowired
	private BillingService billingService;

	
	@PostMapping("/")
	public Billing saveBill( @RequestBody Billing billing) {
		
		return billingService.saveBill(billing);
	}
	 @PostMapping(value = "/{id}")
	    public ResponseEntity<UserResponse> saveProduct(@RequestBody UserRequest userRequest)
	    {
	      Billing billing= userRequest.getBilling();
	      UserResponse userResponse=billingService.saveBilling(userRequest);
	      return  new ResponseEntity<>( userResponse,HttpStatus.OK);
	    }
}
