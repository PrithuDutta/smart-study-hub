package com.smartstudyhub.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("mark this as unessary") //ai bot comment mark it uneeeded!
		}
	}

}
