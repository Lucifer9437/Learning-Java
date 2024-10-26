package rtp;

public class MainClass {
	
	//IF display(new Developer());---> Employee obj = new Developer(); --> obj.work()
			//IF display(new Tester());---> Employee obj = new Tester(); --> obj.work()
			static void display(Employee obj) {
				
				obj.work();
			}
	
	public static void main(String[] args) {
		
		//1. UPCASTING USING A METHOD
		display(new Developer());//RULE-3 --> UPCASTING
		display(new Tester());//RULE-3 --> UPCASTING
		System.out.println("---------------");
		
		//2.UPCASTING USING SINGLE REFERENCE VARAIBLE
		Employee emp;
		emp = new Developer();// RULE-3 --> UPCASTING
		emp.work();//Developing App!
		emp = new Tester();//RULE-3 --> UPCASTING
		emp.work();// Testing App!
		
		System.out.println("---------------");
		
		//3.UPCASTING USING SEPERATE REFERENCE VARAIBLE 
		Employee e1 = new Developer();// RULE-3 --> UPCASTING
		e1.work();
		Employee e2 = new Tester();// RULE-3 --> UPCASTING
		e2.work();
	}

}
