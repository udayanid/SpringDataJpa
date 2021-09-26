package com.localdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.localdeveloper.entity.UserEntity;
import com.localdeveloper.repository.UserRepository;

@SpringBootApplication
public class SbDataJpaApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbDataJpaApp1Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		//by default there is no implementation for UserRepository so it will create a proxy object  we can check that using below line
		System.out.println(userRepository.getClass().getName());
		//preparing UserEntity Object with data
		UserEntity userEntity = new UserEntity();
		userEntity.setUserId(101);
		userEntity.setUname("local developer");
		userEntity.setEmail("mailofudayan@gmail.com");
		userEntity.setAge(33);
		//performing db crud operation
		userRepository.save(userEntity);
	}
}
