package com;

public class MainRunner {
	
	static void selectState(India obj) {
		if(obj instanceof Karnataka) {
			System.out.println("State -> Karnataka");
			Karnataka k = (Karnataka) obj;
			System.out.println("PM: "+k.PM+" CM: "+k.CM);
		}
		else if(obj instanceof TamilNadu) {
			System.out.println("State -> TamilNadu");
			TamilNadu t = (TamilNadu) obj;
			System.out.println("PM: "+t.PM+" CM: "+t.CM);
			
			
		}
		else if(obj instanceof Goa) {
			System.out.println("State -> Goa");
			Goa g = (Goa) obj;
			System.out.println("PM: "+g.PM+"CM: "+g.CM);
			
		}
	}
	
	public static void main(String[] args) {
		selectState(new Karnataka());
		System.out.println("---------");
		selectState(new TamilNadu());
		System.out.println("---------");
		selectState(new Goa());
	}

}
