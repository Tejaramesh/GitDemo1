package collections;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("test");
		a.add("Manual Testing");
		a.add("REST API");
		a.add("Selenium with JAVA");
		System.out.println(a.indexOf("Selenium with JAVA"));
		a.add(0, "SQL");
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.contains("test"));
		
	}

}
