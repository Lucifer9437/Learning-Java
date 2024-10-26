package com;

interface Paytm{
	
	void pay(int amount);
	
}

public interface Flipkart extends Paytm {
	
	void buy(String product);

}
