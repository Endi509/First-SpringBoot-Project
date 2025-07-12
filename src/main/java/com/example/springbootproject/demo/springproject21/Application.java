package com.example.springbootproject.demo.springproject21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Eshte annotationi me i rendesishem ne nje projekt springu
// vendoset zakonisht mbi klasen kryesore te aplikacionit
// dhe kombinon 3 annotations e tjera te Springut
// @SpringBootApplication = @Configuration + @EnableAutoConfiguration
// + @ComponentScan

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
