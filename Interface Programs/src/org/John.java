package org;

 class John extends Student implements Hotel, Threatre {
	
	@Override
	 void study() {
		System.out.println("Studing");
	}
	
	@Override
	public void eatFood() {
		System.out.println("Eating Food");
	}
	
	@Override
	 public void watchMovie() {
		System.out.println("Watching Movie");
	}
	
	public static void main(String[] args) {
		
		John j = new John();
		j.study();
		j.eatFood();
		j.watchMovie();
	}
	

}
