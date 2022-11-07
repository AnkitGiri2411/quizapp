package com.quiz.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.app.dto.UserDto;
import com.quiz.app.entity.UserEntity;
import com.quiz.app.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public UserEntity singup(UserDto singupDto) {
		UserEntity userEntity = userRepository.findByUserLoginId(singupDto.getUserLoginId());
		if(null!=userEntity) 
			return null;
		
		
		UserEntity userEntity2 = new UserEntity();
		userEntity2.setUserName(singupDto.getUserName());
		userEntity2.setUserLoginId(singupDto.getUserLoginId());
		userEntity2.setUserLoginPassword(singupDto.getUserLoginPassword());
		userEntity2.setUserContactNumber(singupDto.getUserContactNumber());
		userEntity2.setUserGmailId(singupDto.getUserGmailId());
		userRepository.save(userEntity2);
		return userEntity2;
	}

	public UserEntity login(UserDto loginDto) {
		UserEntity entityClass = userRepository.findOneByUserLoginIdIgnoreCaseAndUserLoginPassword(loginDto.getUserLoginId(),loginDto.getUserLoginPassword());
		if(entityClass==null) {

			return null;
		}

		return entityClass;
	}

}
