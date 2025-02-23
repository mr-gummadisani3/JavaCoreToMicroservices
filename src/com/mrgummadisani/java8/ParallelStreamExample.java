package com.mrgummadisani.java8;

import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {

		// Parallel Streaming enable concurrent execution

		IntStream.rangeClosed(1, 10).parallel().sorted().forEach(System.out::println);
	}

}
