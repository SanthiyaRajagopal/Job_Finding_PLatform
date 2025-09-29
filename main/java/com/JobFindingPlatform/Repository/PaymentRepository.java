package com.JobFindingPlatform.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JobFindingPlatform.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long>{
	List<Payment>findByUserId(Long userId);

}
