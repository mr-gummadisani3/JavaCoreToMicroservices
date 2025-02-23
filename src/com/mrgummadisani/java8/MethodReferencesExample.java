package com.mrgummadisani.java8;

import java.util.ArrayList;

public class MethodReferencesExample {

	public static void printMessage(String name) {
		System.out.println(name);
	}
	
	public void printMessage1(String name) {
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
//Method reference with sysout	
ArrayList<String> l=new ArrayList<>();
l.add("mahesh");
l.add("suresh");
l.add("rajesh");
l.stream().forEach(System.out::println);
//Method reference with Class Name
 l.forEach(MethodReferencesExample::printMessage);     
//Method reference with instance 
 MethodReferencesExample methodReferencesExample=new MethodReferencesExample();
 l.forEach(methodReferencesExample::printMessage1);
	}

}
