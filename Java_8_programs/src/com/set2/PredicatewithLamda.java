package com.set2;

import java.util.function.Predicate;

public class PredicatewithLamda {
	
	public static void main(String[] args) {
		
		
		Predicate<String> is = s->s.isEmpty();
		
		System.out.println(is.test(""));
		System.out.println(is.test("Muthu"));
	}

}
