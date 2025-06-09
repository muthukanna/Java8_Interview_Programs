package com.set3;

import java.util.List;

public class ReduceMethod {

	public static void main(String[] args) {
		
		
		List<Integer> lst = List.of(2,4,3,1,5,7,1,6);
		
		Integer reduce = lst.stream().reduce(0, (a,b)->a+b);
		
		System.out.println("addition of : "+ reduce);
	}
}
