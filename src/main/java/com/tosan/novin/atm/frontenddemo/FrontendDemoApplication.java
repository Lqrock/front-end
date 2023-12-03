package com.tosan.novin.atm.frontenddemo;

import controller.ClientForwardController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = ClientForwardController.class)
public class FrontendDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontendDemoApplication.class, args);
	}

}
