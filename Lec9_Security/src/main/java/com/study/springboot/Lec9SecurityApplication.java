package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Lec9SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lec9SecurityApplication.class, args);
//		String encoded = PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("1234");
//		System.out.println(encoded); 소스만 받으려 만든것
	}

}
