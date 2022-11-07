package com.quiz.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.app.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{


	UserEntity findByUserLoginId(String userLoginId);

	UserEntity findOneByUserLoginIdIgnoreCaseAndUserLoginPassword(String userLoginId, String userLoginPassword);

}
