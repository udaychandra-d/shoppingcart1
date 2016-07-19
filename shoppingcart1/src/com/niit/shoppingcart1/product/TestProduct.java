package com.niit.shoppingcart1.product;

public class TestProduct {
	
	public static void main(String[] args) {
		Product w=new Product();
		w.setId("354");
		w.setName("uday");
		w.setPrice(10000);
		System.out.println(w.getId());
		System.out.println(w.getName());
		System.out.println(w.getPrice());
	}

}
