package com.example.demo.BillingService.controller;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.BillingService.entity.Payment;

@FeignClient(name = "PAYMENT-SERVICE")
public interface PaymentServiceClient {

    @PostMapping(value = "/payments/makepayment")
    public Payment makePayment(Payment payment);
}