package com.qa.day8.collectionandmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Runner {
	public static void main(String[] args) {
		Collection<Integer> nums = new ArrayList<>();
		Set<Integer> nums1 = new HashSet<>();

		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums1.add(1);
		nums1.add(2);
		nums1.add(3);
		nums1.add(4);
		nums1.add(4);
		nums1.add(5);

		System.out.println(nums1);
		
		//HashMap - Key, Value paired
		//"key" : "value"
        Map<String, String> citiesMap = new HashMap<>();

		citiesMap.put("England", "London");
		citiesMap.put("Spain", "Madrid");
		citiesMap.put("France", "Paris");
		
		System.out.println(citiesMap.get("Spain"));
		System.out.println(citiesMap.values());
		System.out.println(citiesMap.keySet());
		System.out.println(citiesMap.entrySet());
		System.out.println(citiesMap);
	}
}
