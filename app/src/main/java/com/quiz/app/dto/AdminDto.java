package com.quiz.app.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {
	
private String adminName;
	
	private String adminLoginId;
	
	private String adminPassword;
	
	private String adminContactNumber;
	
	
	//All Setter and Getter Methods


	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminLoginId() {
		return adminLoginId;
	}

	public void setAdminLoginId(String adminLoginId) {
		this.adminLoginId = adminLoginId;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminContactNumber() {
		return adminContactNumber;
	}

	public void setAdminContactNumber(String adminContactNumber) {
		this.adminContactNumber = adminContactNumber;
	}
	

}
