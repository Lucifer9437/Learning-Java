package com;

public class Demo {
	public static void main(String[] args) {
		
		//Array Declaration
		int[] a;
		
		//Array creation
		a = new int[3];
		
		//Printing Array Elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[0]+" "+a[2]);//Concatenation
		System.out.println("Length:"+a.length);
		
		System.out.println("---");
		
		//Array Initialization
		a[0] = 10;
		a[2] = 50;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("-------");
		 
		//Array Declaration and Creation
		double[] x = new double[2];
		
	}

}
