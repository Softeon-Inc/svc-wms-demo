package com.softeon.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SvcApplication {

	public static void main(String[] args) {
		String abc="";
		if(abc.equals("abc")){}
		SpringApplication.run(SvcApplication.class, args);
	}

}
