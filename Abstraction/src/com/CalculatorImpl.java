package com;

public class CalculatorImpl implements Calculator{
	
	@Override
	public void add(int a,int b) {
		int sum = a+b;
		System.out.println("Sum of "+a+" & "+b+" is "+sum);
		
	}
	
	@Override
	public void multiply(int a,int b) {
		System.out.println("Product of "+a+" & "+b+" is "+(a*b));
		
	}

}
