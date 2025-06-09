package com.set3;

import java.util.List;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		
		
		List<Integer> lst  = List.of(3,5,1,6,8,2,14);
		
		List<Integer> even = lst.stream().filter(i->i%2==0).toList();
		
		List<Integer> odd = lst.stream().filter(i->i%2!=0).toList();
		
		System.out.println("Odd numbers are : "+odd);
		
		System.out.println("Even numbers are : "+even);
		
		

}
}