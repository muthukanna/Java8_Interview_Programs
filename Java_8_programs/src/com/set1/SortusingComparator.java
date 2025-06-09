package com.set1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortusingComparator {

	public static void main(String[] args) {

		List<String> lst = Arrays.asList("muthu", "rahul", "an");

		lst.sort(Comparator.comparingInt(String::length));

		lst.forEach(System.out::println);
	}

}
