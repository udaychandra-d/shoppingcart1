package com.niit.shoppingcart2.product1;
import java.util.ArrayList;
	import java.util.Iterator;
public class product2 {
   

		public static void main(String[] args) {
			ArrayList<String> a1= new ArrayList<String>();
			a1.add("java");
			a1.add("c++");
			a1.add("sql");
			a1.add("oracle");
			a1.add("php");
			a1.add("html");
			System.out.println(a1);
			System.out.println("does the list contains java"+a1.contains("java"));
			a1.add(2, "COBOLT");
			System.out.println(a1);
			System.out.println(a1 .isEmpty());
			System.out.println(a1.size());
			Iterator<String> itr= a1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}	
		}
	}
