package com;

public class Solution {
	
	//GENERALIZATION OR UPCASTING
	//1. IF display(new Son()) -> Father obj = new Son();
	//2. IF display(new Daughter()); -> Father obj = new Daughter();
	static void display(Father obj) {
		if(obj instanceof Son) {
			System.out.println("Down Casting to Son");
			Son s = (Son) obj;
			System.out.println(s.x+"  "+s.y);//10  20
			
			
		}
		else if (obj instanceof Daughter) {
			System.out.println("Down Casting to Daughter");
			Daughter d = (Daughter) obj;
			System.out.println(d.x+"  "+d.z);//10  30
		}
	}
	
	public static void main(String[] args) {
		
		display(new Son());
		System.out.println("--------");
		display(new Daughter());
	}

}
