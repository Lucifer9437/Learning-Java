package javabean;

import java.util.Scanner;

public class EmployeeMainClass {

	public static void main(String[] args) {

		Employee e = new Employee();

		Scanner sc =  new Scanner(System.in);

		System.out.println("Enter Id");
		int id =sc.nextInt();
		e.setId(id);//e.setId(sc.nextInt())

		System.out.println("Enter Employee Name");
		String name = sc.next();
		e.setName(name);//e.setName(sc.next())

		System.out.println("Enter Employee Salary");
		int salary = sc.nextInt();
		e.setSalary(salary);//e.setSalary(sc.nextInt())

		sc.close();

		System.out.println("----EMPLOYEES DETAILS----");
		System.out.println("Id: "+e.getId());
		System.out.println("Name: "+e.getName());
		System.out.println("Salary: "+e.getSalary());



	}

}
