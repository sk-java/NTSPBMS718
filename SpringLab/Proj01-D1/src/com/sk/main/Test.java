package com.sk.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.sbeans.DatePrinter;

public class Test {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/sk/cfgs/applicationContext.xml");

		DatePrinter print = (DatePrinter) ctx.getBean("dp");
		
		print.printDate();
	}

}
