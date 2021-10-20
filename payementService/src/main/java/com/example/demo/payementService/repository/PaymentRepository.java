package com.example.demo.payementService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.payementService.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>{

}
