package com.set1;

import java.util.List;

public class IteratingUsingLambda {

	public static void main(String[] args) {

		List<Integer> lst = List.of(1, 4, 1, 5, 6, 7, 2, 9, 6, 2);

		lst.stream().forEach(System.out::println);

	}

}
