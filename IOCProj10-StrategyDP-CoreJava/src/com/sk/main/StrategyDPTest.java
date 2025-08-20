package com.sk.main;

import com.sk.comps.ECommerceStore;
import com.sk.factory.ECommerceStoreFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		ECommerceStore store = ECommerceStoreFactory.getInstance("dtdc");
		String result = store.shopping(new String[] {"rakhi, sweets, dress"},  new double[] {1000, 2000, 4000});
		System.out.println(result);
		
		System.out.println("========================================================================================");
		
		ECommerceStore store1 = ECommerceStoreFactory.getInstance("dtdc");
		String result2 = store.shopping(new String[] {"flag", "sweets", "white dress"},  new double[] {100, 200, 400});
		System.out.println(result2);
	}

}
