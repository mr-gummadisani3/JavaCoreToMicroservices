package com.mrgummadisani.Oops;

class BankAccount {
	// private fields
	private int id;
	private String name;
	private double balance;

	public BankAccount(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// public factory methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// some public methods to deposit and withdraw balance securly

	public double withdraw(double amount) {
		if (amount <= balance && amount > 0)
			balance -= amount;

		return balance;
	}

	public double deposit(double amount) {
		if (amount > 0)
			balance += amount;

		return balance;
	}

}

public class EncapsulationExample {

	public static void main(String[] args) {
	    
		BankAccount ba= new BankAccount(1,"G Maheswar Reddy",20000.00);
		//Accessing data safely through the public methods 
		ba.setBalance(25000);
		System.out.println("After setting "+ ba.getBalance());
		System.out.println("After deposit amount "+ba.deposit(10000));
		System.out.println("After withdraw amount "+ba.withdraw(10000));
		
		
		

	}

}
