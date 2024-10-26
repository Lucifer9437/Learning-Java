package org;

public class Tom extends Employee implements Jspiders, Qspiders {
	
	@Override
	public void work() {
		System.out.println("Working");
		
	}
	
	@Override
	public void developApp() {
		System.out.println("Developing");
		
	}
	
	@Override
	public void testApp() {
		System.out.println("Testing");
	}
	public static void main(String[] args) {
		
		Tom t = new Tom();
		t.work();
		t.developApp();
		t.testApp();
	}

}
