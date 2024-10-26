package day4;

public class LaptopMainClass {
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("Dell",50000);
		Laptop l2 = new Laptop("Apple",99999);
		
		Laptop[] l = {l1, l2};
		
		for(int i = 0; i<l.length;i++) {
			System.out.println(l[i]);//printing 11 & 12 ->> ref var ->>toString
		}
		
	}

}
