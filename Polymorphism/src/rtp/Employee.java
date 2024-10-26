package rtp;

public class Employee {

	void work() {

		System.out.println("Employee Is Working");

	}

}

class Developer extends Employee{ // rule 1
	@Override // rule 2
	void work() {

		System.out.println("Developing The App!");

	}
}

class Tester extends Employee{  // rule 1

	@Override // rule 2
	void work() {

		System.out.println("Testing App!");
	}
}
