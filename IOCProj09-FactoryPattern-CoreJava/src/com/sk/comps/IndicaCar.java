package com.sk.comps;

public class IndicaCar implements ICar {

	public IndicaCar() {
		System.out.println("IndicaCar:: 0-param constructor");
	}

	@Override
	public void makeCar() {
		System.out.println("IndicaCar.makeCar() ---->manufacturing Indica Car");
	}

	@Override
	public void testDrive() {
		System.out.println("IndicaCar.testDrive() ----> test driving the Indica Car ");
	}

}
