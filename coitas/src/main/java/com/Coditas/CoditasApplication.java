package com.Coditas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
//@ComponentScan(basePackages = "com.Sakshi")
public class CoditasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoditasApplication.class, args);
	}

}
