package com.set1;

import java.util.List;

public class SortTheInteger {

	public static void main(String[] args) {

		List<Integer> list = List.of(3, 6, 7, 8, 3, 4, 1);

		list.sort((s1, s2) -> s1.compareTo(s2));

		list.forEach(System.out::println);
	}

}
