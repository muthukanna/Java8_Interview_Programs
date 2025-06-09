package com.set1;

import java.util.Scanner;

@FunctionalInterface
interface CustomInterface {
	public int addNumber(int a, int b);
}

public class CustomFunctionalInterfaceImple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the number of b : ");
		int b = sc.nextInt();

		CustomInterface r = (int c, int d) -> c + d;

		int number = r.addNumber(a, b);
		
		System.out.println(number);
	}

}
