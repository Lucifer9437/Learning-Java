package javabean;

public class CarMainClass {
	
	public static void main(String[] args) {
		Car c = new Car();
		
		c.setBrand("Audi");
		c.setCost(5000000);
		
		System.out.println("Brand: "+c.getBrand());
		System.out.println("Cost: "+c.getCost());
	}

}
