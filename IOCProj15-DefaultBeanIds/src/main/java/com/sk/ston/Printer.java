package com.sk.ston;

import org.springframework.stereotype.Component;

//@Component("prn")
public class Printer {
	private static Printer INSTANCE;

	// private constructor
	private Printer() {
		System.out.println("Printer:: 0-param constructor");
	}

	//public static factory method having singleton logic
	public static Printer getInstance() {
		// singleton logic
		if (INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}

	// business method
	public void printData(String msg) {
		System.err.println("Data is: " + msg);
	}
}
