package javaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Filter {
public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		long d = Stream.of("Abhijet","Adam","Don","Ram","Alekhya").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}
}

