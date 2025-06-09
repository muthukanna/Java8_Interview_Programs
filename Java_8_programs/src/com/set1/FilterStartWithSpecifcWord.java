package com.set1;

import java.util.List;

public class FilterStartWithSpecifcWord {

	public static void main(String[] args) {

		List<String> lst = List.of("Muthu", "Rajjev", "Treega", "Manjula", "Meena");

		List<String> list = lst.stream().filter(i -> i.startsWith("M")).toList();
		
		System.out.println(list);
	}

}
