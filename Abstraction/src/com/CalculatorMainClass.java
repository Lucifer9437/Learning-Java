package com;
import java.util.Scanner;

public class CalculatorMainClass {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);//7899792036
		Calculator calc = new CalculatorImpl();//RULE 4 UP CASTING
		
		System.out.println("Enter 2 Numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		calc.add(a, b);
		calc.multiply(a, b);
		
		scan.close();
	}

}
