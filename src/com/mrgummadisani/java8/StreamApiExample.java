package com.mrgummadisani.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiExample {
//Streams process collections efficiently using functional style operations
	public static void main(String[] args) {
	 List<Integer> s=Arrays.asList(1,2,3,4,5,6,7);
	 
	List<Integer> list=s.stream().filter(s1 -> s1%2 == 0).collect(Collectors.toList());
	
	System.out.println(list);
	}

}
