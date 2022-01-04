package com.example.sleep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SleepApplication {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Start");

		Thread.sleep(30000);

		System.out.println("End");

		System.exit(0);
	}

}
