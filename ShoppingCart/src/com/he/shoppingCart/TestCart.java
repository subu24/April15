package com.he.shoppingCart;

import java.util.HashMap;
import java.util.Map;


public class TestCart {
	public static void main(String[] args) {
		//TestCart testCart=new TestCart();
		Inventory inv=Inventory.getInstance();
		Product p1= new Product("pen", 10.7);
		Product p2= new Product("mob", 1022.9);
		Product p3= new Product("pant", 666.7);
		Product p4= new Product("book", 50.7);
		Product p5= new Product("pencil", 8.7);
		Map<Product, Integer> map=new HashMap<Product,Integer>();
		map.put(p1, 8);
		map.put(p2, 5);
		map.put(p3, 3);
		map.put(p4, 9);
		map.put(p5, 10);
		inv.addItems(map);
	}

}
