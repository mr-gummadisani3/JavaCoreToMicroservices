package com.mrgummadisani;

//Abstract class hiding method implementation
abstract class Vehicle {

	public abstract String startEngine();

	public String stopEngine() {
		return "Engine stoped";
	}

	public Vehicle() {
		System.out.println("abstract Class default constructor");
	}
}

//Child1
class Car extends Vehicle {

	@Override
	public String startEngine() {
		return "Car Engine Started";
	}

}

//Child2
class Bike extends Vehicle {

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Bike Engine Started";
	}

}

public class AbstractionExample {

	public static void main(String[] args) {
		//The Vehicle class is abstract and cannot be instantiated on its own. It declares an abstract method 
		//startEngine(),which forces anyy subclass like Car or Bike to provide its own implementation its hide the data how each vehicle start the engine
		
		Vehicle vehicle = new Bike();
		System.out.println(vehicle.startEngine());
		System.out.println(vehicle.stopEngine());

		
		Vehicle vehicle2 = new Car();
		System.out.println(vehicle2.startEngine());
		System.out.println(vehicle2.stopEngine());
	}

}
