package com.set2;

import java.util.function.Function;

public class FunctionWithLambda {

	public static void main(String[] args) {

		Function<String, Integer> fb = s -> s.length();
		Integer apply = fb.apply("muthu");
		
		System.out.println(apply);
	}
	

}
