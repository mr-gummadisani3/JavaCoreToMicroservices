package com.mrgummadisani.java8;

interface Calcul{
	//In Java 8 static and default methods added
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public default void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}

class SunClass implements Calcul{

	
	
}


public class DefaultAndStaticMethodExample {

	public static void main(String[] args) {
		Calcul.add(1,1);
		
		Calcul calculator =new SunClass();
		calculator.add(1, 2, 3);
		
	}

}
