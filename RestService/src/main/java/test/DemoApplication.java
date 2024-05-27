package com.example.demo;
import org.springframework.core.SpringVersion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
//		System.out.println("version: " + SpringVersion.getVersion());
		SpringApplication.run(DemoApplication.class, args);
	}



}
