package com.ronda.tables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.ronda.tables.utils.AppContext;

@SpringBootApplication
@EnableScheduling
public class RondaMain {
	public static void main(String[] args) {
		SpringApplication.run(AppContext.class, args);
	}
}
