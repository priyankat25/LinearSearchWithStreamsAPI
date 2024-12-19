package com.kodnest.streamAPI;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {
	public static void main(String[] args) { 
		List<Integer> num = Arrays.asList(10,55,70,15,10,3);
		int ele = 10;
		
		long count = num.stream()
		.sorted()
		.filter(n -> n == ele)
		.count();
		
		if(count >= 1) {
			System.out.println("Element is present.");
		}
		else {
			System.out.println("Element is not present.");
		}		
	}
}