package day1;

//
public class Car {
	
	@Override
	public String toString() {
		return "Car@123";
	}

	public static void main(String[] args) {

		//
		//String representation of an object
		Car c = new Car();
		System.out.println(c);// toString ->> c.toString
		System.out.println(c.toString());
	}

}
