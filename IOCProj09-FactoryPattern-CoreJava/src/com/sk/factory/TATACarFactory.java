package com.sk.factory;

import com.sk.comps.ICar;
import com.sk.comps.IndicaCar;
import com.sk.comps.NexonCar;
import com.sk.comps.SafariCar;

public interface TATACarFactory {

	public static ICar getInstance(String model) {
		System.out.println("TATACarFactory.getInstance()");
		ICar car = null;

		if (model.equalsIgnoreCase("nexon")) {
			car = new NexonCar();
		} else if (model.equalsIgnoreCase("safari")) {
			car = new SafariCar();
		} else if (model.equalsIgnoreCase("indica")) {
			car = new IndicaCar();
		} else {
			throw new IllegalArgumentException("Invalid car model");
		}
		return car;
	}
}
