package com.example.demo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
@EnableScheduling
public class MolibApplication {

	public static void main(String[] args) {
		SpringApplication.run(MolibApplication.class, args);
	}
	
}
