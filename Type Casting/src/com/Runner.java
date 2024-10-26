package com;

public class Runner {

	//Employee obj = new Developer();  Employee obj = new Tester();
	static void display(Employee obj) { 

		if (obj instanceof Developer) {
			Developer d = (Developer) obj;//Downcasting
			System.out.println("Id: "+d.id+"  Name "+d.name);
			d.developeApp();
		}
		else if(obj instanceof Tester) {
			Tester t = (Tester) obj;//Downcasting
			System.out.println("Id: "+t.id+"  Name "+t.name);
			t.testApp();

		}

	}

	public static void main(String[] args) {
		display(new Developer());
		System.out.println("-------------");
		display(new Tester());

	}

}
