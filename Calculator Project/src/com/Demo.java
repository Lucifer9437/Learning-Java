package com;

import java.util.*;
public class Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//INFINITE LOOP
		while(true) {

			System.out.println("Enter choice");
			int choice = scan.nextInt();

			if(choice == 1) {
				System.out.println("Bando");
			}
			else if(choice == 2) {
				System.out.println("Bia");
			}
			else if(choice == 3) {
				System.out.println("Gandi Mora");
				System.exit(0);
			}
			else {
				System.out.println("INVALID");
			}

			System.out.println("---------------------");


		}
	}



}
