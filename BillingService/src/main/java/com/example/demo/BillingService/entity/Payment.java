package com.example.demo.BillingService.entity;

import java.time.LocalDate;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment {
	
	
	
	private long paymentid;
	
	private LocalDate paymentDate;
	
	private double latePaymentCharges;
	
	private double totalPaid;
	
	private String paymentStatus;

	private long billId;
}
