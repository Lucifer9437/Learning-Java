package day3;

import java.io.*;
public class ThrowsDemo3 {
	
	static void read() throws FileNotFoundException{
		FileReader f = new FileReader("car.txt");
		
	}
	
	public static void main(String[] args) {
		try {
			read();
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

}
