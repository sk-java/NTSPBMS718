package com.sk.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.sk.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::0-param constructor");
	}

	@Bean(name = "ldate")
	public LocalDate createDate() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();
	}

	@Primary
	@Bean(name = "ldate1")
	public LocalDate createDate1() {
		System.out.println("AppConfig.createDate1()");
		return LocalDate.of(2024, 9, 21);
	}

	@Bean(name = "ldate2")
	public LocalDate createDate2() {
		System.out.println("AppConfig.createDate2()");
		return LocalDate.of(2023, 11, 16);
	}

	@Bean(name = "ldate3")
	public LocalDate createDate3() {
		System.out.println("AppConfig.createDate3()");
		return LocalDate.of(2022, 02, 11);
	}

}
