package com.idat.AbrilServicio1;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Configurable
@EnableAutoConfiguration
public class AbrilServicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(AbrilServicio1Application.class, args);
	}

	
}
