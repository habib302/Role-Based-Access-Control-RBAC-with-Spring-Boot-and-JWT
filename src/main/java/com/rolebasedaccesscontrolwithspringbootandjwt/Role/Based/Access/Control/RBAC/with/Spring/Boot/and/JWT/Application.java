package com.rolebasedaccesscontrolwithspringbootandjwt.Role.Based.Access.Control.RBAC.with.Spring.Boot.and.JWT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Role Based Access Control (RBAC) with Spring Boot and JWT started...");
	}

}
