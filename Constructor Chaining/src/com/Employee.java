package com;

public class Employee {

	Employee(int id){
		this(20, "Tom");
		System.out.println("ID"+id);	
	}

	Employee(int age, String name){
		System.out.println("Age"+age);
		System.out.println("Name"+name);
	}

	Employee(double salary){
		this(101);
		System.out.println("Salary is"+salary);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(4.5);

	}

}
