package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,99,89);
		   List<Integer> a1 = numbers.stream().sorted().collect(Collectors.toList());
		
System.out.println(a1);		
	}
}
