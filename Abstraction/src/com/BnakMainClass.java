package com;
import java.util.Scanner;

public class BnakMainClass {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome To HDFC Bank");
		System.out.println("--------------------");
		
		Scanner scan = new Scanner(System.in);//accepting input
		
		Bank obj = new BankImpl();//upcasting
		
		while(true) {//Infinite loop
			
			//Menu driven program
			System.out.println("1:Deposit Amount\n2:Withdraw Amount");
			System.out.println("3:Check Balance\n4:Exit");
			System.out.println("Enter Choice");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Amount to be Deposited:");
				int amountToDeposit = scan.nextInt();
				obj.deposit(amountToDeposit);
				break;
				
			case 2:
				System.out.println("Enter Amount to be Withdrawn:");
				int amountToWithdraw = scan.nextInt();
				obj.deposit(amountToWithdraw);
				
			case 3:
				obj.checkBalance();
				break;
				
			case 4:
				System.out.println("Thank You !! Visit Again!!");
				System.exit(0);
				
			default:
				System.out.println("INVALID CHOICE");
				
				
			}
			
			System.out.println("------------");
		}
		
		
	/*System.out.println("Enter amount to be deposited");
		int amountToDeposit = scan.nextInt();
		obj.deposit(amountToDeposit);
		obj.checkBalance();
		
		System.out.println("Enter amount to be withdrawn");
		int amountToWithdraw = scan.nextInt();
		obj.deposit(amountToWithdraw);
		obj.checkBalance();*/
		
		
		
	}

}
