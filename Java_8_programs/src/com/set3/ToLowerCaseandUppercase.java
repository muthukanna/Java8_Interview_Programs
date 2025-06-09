package com.set3;

import java.util.ArrayList;
import java.util.List;

public class ToLowerCaseandUppercase {

	public static void main(String[] args) {

		List<String> lst = List.of("muthu", "KKera", "Rajjev");

		List<String> lowerCase = lst.stream().map(s -> s.toLowerCase()).toList();
		List<String> uperCase = lst.stream().map(s -> s.toUpperCase()).toList();
		
		System.out.println(lowerCase);
		System.out.println(uperCase);

	}

}
