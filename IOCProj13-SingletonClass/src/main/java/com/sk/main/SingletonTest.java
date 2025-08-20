package com.sk.main;

import com.sk.ston.Printer;

public class SingletonTest {

	public static void main(String[] args) {

		Printer printer1 = Printer.getInstance();
		Printer printer2 = Printer.getInstance();
		Printer printer3 = Printer.getInstance();

		System.out.println(printer1.hashCode() + "  " + printer2.hashCode() + "  " + printer3.hashCode());
		System.out.println("printer1 == printer2 ? " + (printer1 == printer2));
		System.out.println("-----------------------------------------------");
		System.out.println("prnter1 == printer3 ? " + (printer1 == printer3));
		System.out.println("-----------------------------------------------");
		printer1.printData("Java");
		printer2.printData("is a");
		printer3.printData("Programming Language");
	}
}
