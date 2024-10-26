package day4;

public class Employee {
	
	int id;
	
	Employee(int id){
		this.id = id;
		
	}
	
	@Override
	public boolean equals(Object obj) {//1.UPCASTING : OBJECTS obj=new Employee(100);
		if(obj instanceof Employee) {//2. checks if obj is having employee object
			Employee e = (Employee) obj;//3.downcasting
			return this.id == e.id;//4.Comparision logic-> e1.id == e2.id ->true
		}
		return false;//5.return false if we compare other objects
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee(100);
		Employee e2 = new Employee(100);
		System.out.println(e1.equals(e2));//e1.equals(new Employee(100));
	}

}
