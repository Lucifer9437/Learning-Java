package com;

public class Student {

	Student(int age){// age = 22
		System.out.println("Age:"+age);

	}

	Student(String name){  // name = "Tom"
		this(22);
		System.out.println("Name:"+name);

	}

	Student(double height){  //height 5.7
		this("Tom");
		System.out.println("Height:"+height);

	}

	public static void main(String[] args) {

		Student s = new Student(5.7);

	}



}
