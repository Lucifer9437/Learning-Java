package com;

import java.util.Scanner;

public class CalculatorMainClass {

	public static void main(String[] args) {

		System.out.println("Welcomr To Calculator Project");
		System.out.println("------------------------------");

		Scanner sc = new Scanner(System.in);

		CalculatorImpl calc = new CalculatorImpl();

		System.out.println("1:Addition\n2:Substraction");
		System.out.println("3:Multiplication\n4:Division");
		System.out.println("Enter choice:");
		int choice = sc.nextInt();
		//local varaible dont have default value so we have to initializing to 0
		int a = 0;
		int b = 0;

		// Acceptiing input only when choice is 1 2 3 4
		if(choice>=1 && choice<=4) {//1 2 3 4
			System.out.println("Enter 2 Numbers");
		     a = sc.nextInt();
			 b = sc.nextInt();

		}

		if(choice == 1) {
			calc.add(a, b);

		}

		else if(choice == 2) {
			calc.sub(a, b);

		}

		else if(choice == 3) {
			calc.mul(a, b);

		}

		else if(choice == 3) {
			calc.div(a, b);

		}
		else {
			System.out.println("Invalid Choice");
		}



	}

}
