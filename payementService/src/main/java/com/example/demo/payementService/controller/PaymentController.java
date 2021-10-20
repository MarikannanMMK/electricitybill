package com.example.demo.payementService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.payementService.entity.Payment;
import com.example.demo.payementService.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	@Autowired
	private PaymentService paymentServices;
	
	@PostMapping("/")
	public Payment savePayment(Payment payment) {
		return paymentServices.savePayment(payment);
	}
	
	@PostMapping("/makepayment")
	public Payment makepayment(Payment payment) {
		return paymentServices.savePayment(payment);
	}
	

	
	

}
