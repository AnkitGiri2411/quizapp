package com.quiz.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.app.dto.AdminDto;
import com.quiz.app.entity.AdminEntity;
import com.quiz.app.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	public AdminEntity singup(AdminDto singupDto) {
		AdminEntity adminEntity = adminRepository.findByAdminLoginId(singupDto.getAdminLoginId());
		if(adminEntity!=null)
			return null;
		
		AdminEntity adminEntity2 = new AdminEntity();
		adminEntity2.setAdminLoginId(singupDto.getAdminLoginId());
		adminEntity2.setAdminPassword(singupDto.getAdminPassword());
		adminEntity2.setAdminName(singupDto.getAdminName());
		adminEntity2.setAdminContactNumber(singupDto.getAdminContactNumber());
		adminRepository.save(adminEntity2);
		return adminEntity2;
	}

	public AdminEntity login(AdminDto loginDto) {
		AdminEntity entityClass = adminRepository.findOneByAdminLoginIdIgnoreCaseAndAdminPassword(loginDto.getAdminLoginId(),loginDto.getAdminPassword());
		if(entityClass==null) {

			return null;
		}

		return entityClass;
	}

}
