package javabean;

//rule 1
public class Car {
	
	//rule 2
	private String brand;
	private int cost;
	
	
//rule 3a
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
		
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getCost() {
		return cost;
	}
	

}
