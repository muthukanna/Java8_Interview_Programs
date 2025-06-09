package com.set1;

public class Runnableinterface {

	public static void main(String[] args) {

		Runnable r = () -> {
			System.out.println("Hello World...!");
		};

		new Thread(r).start();
	}

}
