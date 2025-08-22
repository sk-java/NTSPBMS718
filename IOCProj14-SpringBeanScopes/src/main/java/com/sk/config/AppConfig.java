package com.sk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.sk.ston.Printer;

@Configuration
@ComponentScan(basePackages = { "com.sk.sbeans", "com.sk.ston" })
@ImportResource("com/sk/cfgs/applicationContext.xml")
public class AppConfig {

	@Bean(name = "p1")
	public Printer getPrinter1() {
		System.out.println("AppConfig.getPrinter1()");
		return Printer.getInstance();
	}

	@Bean(name = "p2")
	public Printer getPrinter2() {
		System.out.println("AppConfig.getPrinter2()");
		return Printer.getInstance();
	}
}
