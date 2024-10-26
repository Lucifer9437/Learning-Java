package rtp;

public class Runner {
	
	static void selectApp(FoodDeliveryApp obj) {
		obj.orderFood();
		
	}
	
	public static void main(String[] args) {
		
		//1.upcasting using a method
		selectApp(new Swiggy());
		selectApp(new Zomato());
		
		System.out.println("--------------");
		
		//2.Upcasting using single reference value
		FoodDeliveryApp app;
		app = new Swiggy();
		app.orderFood();
		app = new Zomato();
		app.orderFood();
		System.out.println("---------------");
		
		//3.upcasting using seperate reference value
		FoodDeliveryApp f1 = new Swiggy();
		f1.orderFood();
		FoodDeliveryApp f2 = new Zomato();
		f2.orderFood();
	}

}
