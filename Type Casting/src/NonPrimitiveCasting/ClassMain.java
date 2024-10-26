package NonPrimitiveCasting;

public class ClassMain {
	
	public static void main(String[] args) {
		
		//upcasting
		Vehicle v = new Car();
		System.out.println(v.brand);
		v.start();
		
		System.out.println("--------");
		
		//downcasting
		Car c = (Car) v;
		System.out.println(c.color);
		c.drive();
		
	}

}
