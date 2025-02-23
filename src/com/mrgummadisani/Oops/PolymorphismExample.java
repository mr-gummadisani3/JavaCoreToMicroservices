package com.mrgummadisani.Oops;
//we can achive polymorphism by two ways 1.method overriding 2.method overloading
//method overring

class Calculator{
	public String name="Simple Calculator";
	//overloading with constructor
	public Calculator() {
		System.out.println("Default Constructor  ");
	}
	
	public Calculator(String name) {
		System.out.println("Parametorised Constructor Type of Claculator "+name);
	}
	
	//Overloading methods
	public void add(int a, int b) {
		System.out.println("method with int type data adding "+  (a + b));
	}
	
	public void add(double a, double b) {
		System.out.println("method with double type data adding "+ (a + b));
	}
	
	//Overrding method
	public void display() {
		System.out.println("Display method in Calculator");
	}
	
}

class AdvanceCalculator extends Calculator{
	public String name="Advanced Calculator";

	public AdvanceCalculator(String name) {
		super(name);
		System.out.println("Getting name from AdvancedCalculator "+name);
	}
	
	@Override
	public void display() {
		System.out.println("Display method in Advanced Calculator");
	}
	}



public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//method overloading
		Calculator calculator = new Calculator();
		Calculator calculator1 = new Calculator("Simple");
		
		//method overloading
		calculator.add(1, 2);
		calculator.add(1.0, 3.0);
		
		//method overring
		
		Calculator calculator3 = new AdvanceCalculator("Advance");
		calculator3.display();
		

		
       



	}

}
