package com.set3;

import java.util.List;

public class CalculateAverageInterger {

	public static void main(String[] args) {

		List<Integer> lst = List.of(10, 4, 2, 3, 1, 5);

		Double average = lst.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();

		System.out.println(average);
	}

}
