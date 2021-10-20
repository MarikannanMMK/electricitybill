package com.example.demo.BillingService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.BillingService.controller.PaymentServiceClient;
import com.example.demo.BillingService.entity.Billing;
import com.example.demo.BillingService.entity.Payment;
import com.example.demo.BillingService.entity.UserRequest;
import com.example.demo.BillingService.entity.UserResponse;
import com.example.demo.BillingService.repository.BillingRepository;

@Service
public class BillingService {

	@Autowired
	private BillingRepository billingRepository;
	@Autowired
	private PaymentServiceClient paymentServiceClient;
	
	 private static final String url="http://PAYMENT-SERVICE/payments/makepayment";

	public Billing saveBill(Billing billing) {

		return billingRepository.save(billing);
	}

	public UserResponse saveBilling(UserRequest userRequest) {
		Payment payment=new Payment();
        payment.setPaymentid(userRequest.getBilling().getBillId());
       
        Payment savedPayment=paymentServiceClient.makePayment(payment);
        return new UserResponse(userRequest.getBilling(),savedPayment);
		
	}

}
