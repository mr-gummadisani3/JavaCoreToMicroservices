package com.mrgummadisani.java8;

//A functional interface has exactly one abstract method and having many static and default methods
@FunctionalInterface
interface Calculator{
	int add(int a, int b);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		Calculator cal=(a,b) -> a+b;
		System.out.println(cal.add(1, 5));
		
		
	}

}
