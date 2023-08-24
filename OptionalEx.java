package com.streams.optional;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {

		String s = null;

		Optional<String> optional = Optional.ofNullable(s);
		//System.out.println("avalable: " + optional.get());

		if (optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println("avalable value not pass");
		}

	}
}
