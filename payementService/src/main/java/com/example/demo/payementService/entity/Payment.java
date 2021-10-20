package com.example.demo.payementService.entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long paymentid;
	
	private LocalDate paymentDate;
	
	private double latePaymentCharges;
	
	private double totalPaid;
	
	private String paymentStatus;

}
