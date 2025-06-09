package com.set2;

import java.util.function.Supplier;

public class SuplierWithLambda {

	public static void main(String[] args) {

		Supplier<String> s = () -> "java";

		System.out.println("THe vaule is : " + s.get());
	}

}
