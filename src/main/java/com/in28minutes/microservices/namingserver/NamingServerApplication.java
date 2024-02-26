package com.in28minutes.microservices.namingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NamingServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NamingServerApplication.class, args);
	}
	
	// *************************************************************************************************************
	/*
	 * TO CREATE A NAMING SERVER, ONE OF THE OPTIONS THAT THE SPRING CLOUD PROVIDES IS EUREKA.
	 * 
	 * Step 01 : On start.spring.io, 
	 * 			Create a project (NAMING SERVER) with the dependencies Devtools, Actuator, & 
	 * 			Eureka Server (spring-cloud-netflix Eureka Server). Generate & import in your workspace.
	 * 			(Make sure to put it on git)
	 * 
	 * Step 02 : @EnableEurekaServer on the naming-server.SpringBootApplication Launcher class.
	 * 
	 * Step 03 : Add required properties in application.properties
	 * 
	 * Step 04 : Launch the Application and in the browser (localhost:8761)
	 * 
	 */
	// *************************************************************************************************************
	/*
	 * STEPS TO CONNECT / REGISTER THE CURRENCY CONVERSION & EXCHANGE MICROSERVICE WITH THIS NAMING SREVER :  
	 * 
	 * Step 01 : In the pom files of all the microservices that need to be registered with the naming server, 
	 * add the dependency, after the spring-cloud-starter-config dependency :
	 * <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>
	 * 
	 * Step 02 : In the application.properties of all the registered applications, add their eureka client :
	 * 		> eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka
	 * 
	 * Step 03 : Launch the Naming Server (this application) & the registered application, and 
	 * you should find the registered apps on the eureka server.
	 * 
	 * Step 04 : You will find the registered applications & their URLs on the eureka server.
	 * > You can also find the UP & DOWN status in the logs.
	 */
	// *************************************************************************************************************
	/**
	 * 
	 * STEPS TO LOAD BALANCE BETWEEN THE MULTIPLE INSTANCES OF CURRENCYEXCHANGE MICROSERVICE FROM CURRENCYCONVERSION
	 * 
	 * 
	 */
	
}
