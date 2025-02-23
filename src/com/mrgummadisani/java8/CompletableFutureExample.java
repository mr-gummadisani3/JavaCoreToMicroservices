package com.mrgummadisani.java8;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

	public static void main(String[] args) {
		//handle async excecution with non-blocking code
		CompletableFuture.supplyAsync(() -> "Hello, I am mahesh").thenAccept(System.out::println);
	}
}
