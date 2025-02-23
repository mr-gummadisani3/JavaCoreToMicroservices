package com.mrgummadisani.java8;

//Runnable have run of one abstract method having no params
public class LambdaExpressionsExample {

	public static void main(String[] args) {
		Runnable run= () -> System.out.println("Lambda runnable is running..");
		
		new Thread(run).start();

	}

}
