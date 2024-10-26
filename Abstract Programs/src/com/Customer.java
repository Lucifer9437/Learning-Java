package com;

 class Customer extends Amazon {

	@Override
	void buy() {
		System.out.println("Buying Laptop");
	}

	@Override
	void pay() {
		System.out.println("Paying $50000");
	}

	public static void main(String[] args) {

		Customer c = new Customer();
		c.buy();
		c.pay();

	}

}
