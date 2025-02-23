package com.mrgummadisani.java8;

import java.util.Optional;

public class OptionalClassExample {
//Optional class is used to handle null values safely
	public static void main(String[] args) {
      Optional<String> str = Optional.ofNullable(null);
      System.out.println(str.orElse("Default Value.."));
	}

}
