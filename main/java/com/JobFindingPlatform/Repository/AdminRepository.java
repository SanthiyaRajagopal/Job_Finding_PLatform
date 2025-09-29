package com.JobFindingPlatform.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JobFindingPlatform.Entity.Admin;


public interface AdminRepository extends JpaRepository<Admin ,Long>{
	List<Admin>findByAdminId(Long adminId);
	List<Admin>findByUserId(Long userId);
}
