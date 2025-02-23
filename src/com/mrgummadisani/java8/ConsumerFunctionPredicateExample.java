package com.mrgummadisani.java8;

import java.util.function.Predicate;

public class ConsumerFunctionPredicateExample {
public static void main(String[] args) {
	//Consumer -> Takes input, performs action, returns nothing
	
	//Consumer<Integer> isEven = num ->  System.out.println("printing result");
	
	//Function -> Takes input, returns output
	
	//Predicate ->Takes input returns boolean
	Predicate<Integer> isEven = num -> num%2 == 0;
	System.out.println(isEven.test(5));
	
	
	
}
}
