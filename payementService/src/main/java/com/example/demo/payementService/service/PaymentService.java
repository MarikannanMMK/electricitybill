package com.example.demo.payementService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.payementService.entity.Payment;
import com.example.demo.payementService.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentrepository;

	public Payment savePayment(Payment payment) {
		return paymentrepository.save(payment);
	}
	
	
}
