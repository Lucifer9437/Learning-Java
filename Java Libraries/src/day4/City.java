package day4;

public class City {
	
	String name;
	int pincode;
	
	City(String name,int pincode){
		this.name = name;
		this.pincode = pincode;
		
	}
	
	@Override
	public String toString() {
		return "Pin Code of "+name+" is "+pincode;
	}

}
