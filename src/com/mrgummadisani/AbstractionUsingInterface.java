package com.mrgummadisani;

interface Payment1 {

	public default void printReceipt(double amount) {
		System.out.println("I am default method in Parent interface that cause ambiguty" + amount);
	}

	public static void multipleInheritanceCheck() {
		System.out.println("I am Payment1 Interface static  ");
	}
}

interface Payment {
	// in interface variables are by default public static final
	double SERVICE_CHARGE = 2.5;

	// abstract methods in java is by default public abstract#this method should
	// implement at child class
	void processPayment(double amount);

	// introduced in java8 default methods
	default void printReceipt(double amount) {
		System.out.println("Recept: \n" + "Amount " + amount + "\n" + "Service Charge " + SERVICE_CHARGE + "\n"
				+ "Total Amount " + (amount + SERVICE_CHARGE));
	}

	default void printPrivateHelperUsingDefault() {
		helper();
	}

	// static methods
	public static void doPayment() {
		System.out.println("Please do your payment on time and it is a static method in interface ");
	}

	// Private methods
	private void helper() {
		System.out.println("It is a helper priavte method that has introduced in java 9");
	}

}

class CreditCardPayment implements Payment, Payment1 {

	@Override
	public void processPayment(double amount) {
		System.out.println(
				"Processing credit card amount " + amount + "\n" + "Applying Serices charges " + SERVICE_CHARGE);
		Payment.doPayment();

	}

	@Override
	public void printReceipt(double amount) {
		Payment.super.printReceipt(amount);
		// Payment1.super.printReceipt(amount);
	}

}

public class AbstractionUsingInterface {
	public static void main(String[] args) {
		Payment payment = new CreditCardPayment();
		Payment1 payment1 = new CreditCardPayment();

		payment.processPayment(2000.00);

		payment.printReceipt(2000);

		payment.printPrivateHelperUsingDefault();

		Payment1.multipleInheritanceCheck();
	}
}
