package com.example.demo.BillingService.entity;

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

public class Billing {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long billId;
	
	private LocalDate billDate;
	
	private LocalDate billDueDate;
	
	private int unitsConsumed;
	
	private int billAmount;

}
