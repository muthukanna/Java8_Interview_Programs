package com.set1;

import java.util.Optional;

public class OptionalClassUsing {

	public static void main(String[] args) {
		
		
		Optional<String> msg = Optional.of("lkijjhjjh");
		
		msg.ifPresent(s->System.out.println("Value is preasent : "+ s));
	}

}
