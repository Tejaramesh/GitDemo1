package javaprogram;

import java.util.ArrayList;

public class ArrayListss {
	public static void main(String[] args) {
		
		ArrayList l1=new ArrayList();
		l1.add("test");
		l1.add(10);
		l1.add(true);
		l1.add(20.56); 
		System.out.println(l1);
		l1.add(1,"hello");
		System.out.println(l1);
		
		ArrayList l2=new ArrayList();
		l2.add(15);
		l2.add('A');
		l2.add('c');
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println(l2);
		l1.removeAll(l2);
		System.out.println(l1);
		 System.out.println(l1);
		System.out.println(l2);
	}

}
