package com.mrgummadisani.Oops;

//Parent Class
class Employee {
	public int empId;
	public String empName;
	public double salary;

	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public String display() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary;
	}

}

//Child Class1
class PermanentEmployee extends Employee {
	
	private double bonus;
	public PermanentEmployee(int empId, String empName, double salary, double bonus) {
		super(empId, empName, salary);
		this.bonus=bonus;
		this.salary=bonus+salary;
	}
    
	@Override
	public String display() {
		return super.display()+" bonus=" + bonus+"]";
	}
}

//Child Class2
class ContractEmployee extends Employee{
    private int contractDuration;
	public ContractEmployee(int empId, String empName, double salary,int contract) {
		super(empId, empName, salary);
		this.contractDuration=contract;
	}
	
	@Override
	public String display() {
		return super.display()+" Contract duration in months = "+contractDuration+"]";
	}
	
	
	
	
}

public class InheritanceExample {
	public static void main(String[] args) {
	//PermanentEmployee and ContractEmployee class reusing the details of Employee Class
		
		PermanentEmployee pe= new PermanentEmployee(1,"G Maheswar Reddy",25000.00,12500.00);
		System.out.println("PermanentEmployee: "+pe.display());
		
		ContractEmployee ce=new ContractEmployee(1,"G Maheswar Reddy",25000.00,10);
		 System.out.println("ContractEmployee: "+ce.display());

	}

}
