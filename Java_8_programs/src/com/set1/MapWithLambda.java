package com.set1;

import java.util.Map;
import java.util.HashMap;

public class MapWithLambda {

	public static void main(String[] args) {

		Map<Integer, String> mp = new HashMap<>();

		mp.put(1, "Muthu");
		mp.put(2, "Veera");
		mp.put(4, "Reevan");
		mp.put(6, "vgrig");

		mp.forEach((key, value) -> System.out.println("Key is " + key + " Value is :" + value));
	}

}
