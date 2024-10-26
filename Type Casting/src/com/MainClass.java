package com;

public class MainClass {
	
	public static void main(String[] args) {
		
		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();
		
		System.out.println(s instanceof Son);//TRUE
		System.out.println(s instanceof Father);//TRUE
		System.out.println(new Son() instanceof Father);//TRUE
		
		System.out.println(d instanceof Daughter);//TRUE
		System.out.println(d instanceof Father);//TRUE
		System.out.println(new Daughter() instanceof Father);//TRUE
		
		System.out.println(f instanceof Father);//TRUE
		System.out.println(f instanceof Son);//False
		System.out.println(f instanceof Daughter);//False
		System.out.println(new Father() instanceof Daughter);//False
		
	
		
	}

}
