package com.set2;

import java.util.function.Consumer;

public class ConsumerWithLambda {

	public static void main(String[] args) {

		Consumer<String> com = s -> System.out.println(s);

		com.accept("muthu");
	}

}
