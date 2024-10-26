package day2;

import java.io.*;

public class CheckedExample {
	public static void main(String[] args) {
		
		//Unhandled exception type InterruptedException
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();         
			}
		}
		
		//unhandled exception type FileNotFoundException
		try{
			FileReader f = new FileReader("car.txt");
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			
		}
	}

}
