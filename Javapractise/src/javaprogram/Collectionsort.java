package javaprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionsort {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("MEN");
		l1.add("WOMEN");
		l1.add("KIDS");
		l1.add("MEN");
		l1.add("TOYS");
		l1.add("MEN");
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}
}
