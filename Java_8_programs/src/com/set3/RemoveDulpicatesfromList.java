package com.set3;

import java.util.Arrays;
import java.util.List;

public class RemoveDulpicatesfromList {
	
	
	public static void main(String[] args) {
		
		List<String> lst = Arrays.asList("mom","dad","DAD","vva");
		
		List<String> list = lst.stream().map(i->i.toLowerCase()).distinct().toList();
		
		System.out.println(lst);
		System.out.println(list);
	}

}
