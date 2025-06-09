package com.set1;

public class CreatingAthread {

	public static void main(String[] args) {

		new Thread(() -> System.out.println("This is a lambda expression with thread ")).start();
	}

}
