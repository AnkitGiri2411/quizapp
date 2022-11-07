package com.quiz.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.app.entity.AdminEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer>{


	AdminEntity findByAdminLoginId(String adminLoginId);

	AdminEntity findOneByAdminLoginIdIgnoreCaseAndAdminPassword(String adminLoginId, String adminPassword);

}
