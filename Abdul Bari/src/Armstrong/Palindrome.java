package Armstrong;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number");
		int n = sc.nextInt();
		int m=n;
		int rev=0,r;


		while(n>0) {

			r=n%10;
			rev = rev*10+r;
			n=n/10;
		}

		if(rev==m) {

			System.out.println("The Number is a Palindrome Number");

		}
		else 
			System.out.println("The Number is not a Palindrome Number");




	}

}
