package com.example.demo.BillingService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.BillingService.entity.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long>{
	

}
