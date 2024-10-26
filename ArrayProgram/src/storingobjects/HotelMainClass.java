package storingobjects;

public class HotelMainClass {

	public static void main(String[] args) {

		Hotel h1 = new Hotel("Taj",4.5);
		Hotel h2 = new Hotel("Vivanta",4.8);

		Hotel[] h = {h1,h2};

		for(int i=0; i<h.length; i++) {
			System.out.println("Raiting of "+h[i].name+" is "+h[i].rating);

		}
	}

}
