package com.set2;

import java.util.function.BiFunction;

public class BiFunctionWithLambda {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bi = (a, b) -> a + b;

		System.out.println(bi.apply(4, 6));
	}

}
