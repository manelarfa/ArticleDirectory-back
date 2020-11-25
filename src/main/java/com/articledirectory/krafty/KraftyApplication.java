package com.articledirectory.krafty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KraftyApplication {

	public static void main(String[] args)
	{
		System.setProperty("server.port","8084");
		SpringApplication.run(KraftyApplication.class, args);
	}

}
