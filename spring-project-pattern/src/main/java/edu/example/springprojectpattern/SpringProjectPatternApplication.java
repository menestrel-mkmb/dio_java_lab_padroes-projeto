package edu.example.springprojectpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
*
* Projeto Spring Boot
*
* Cunho: Didático
* Projeto base? Sim, DIO - Curso: Explorando Padrões
* 							de Projetos na Prática com Java
*
* Usando start.spring.io aka Spring Initializr.
* Módulos adicionados:
* 	* Spring Data JPA
* 	* Spring Web
* 	* H2 DB
* 	* OpenFeign
*
* Módulos externos posteriores:
* 	* Via CEP
*	* OpenAPI/Swagger
*
* */

@EnableFeignClients
@SpringBootApplication
public class SpringProjectPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectPatternApplication.class, args);
	}

}
