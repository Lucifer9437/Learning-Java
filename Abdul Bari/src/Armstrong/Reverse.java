package Armstrong;

import java.util.Scanner;


public class Reverse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		int rev=0,r;
		
		while(n>0) {
			
			r=n%10;
			rev =rev*10+r; 
			n=n/10;
		}
		
		System.out.println("Reverse of a Number"+rev);
		
		
		
	}

}