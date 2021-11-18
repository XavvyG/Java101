package com.qa.day8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// Lambda is a function that doesn't belong to any class
//		ArrayList<Integer> numsList = new ArrayList<>();
//		numsList.add(1);
//		numsList.add(2);
//		numsList.add(3);
//		numsList.add(4);
//		numsList.add(5);
//		numsList.add(6);
//
//		// instead of doing for loop
////		numsList.forEach(num -> System.out.println(num));
//
//		// print out even numbers
////		numsList.forEach(num -> {
////			if (num % 2 == 0)
////				System.out.println(num);
////		});
//
//		// initialiser - intermediate operations - terminal operation
//		// .stream() -> map/filter(logic) -> -> -> -> .collect();
//
//		// lambda
//		List<Integer> numsTimesBy5 = numsList.stream().map(n -> n * 5).collect(Collectors.toList());
//		System.out.println(numsTimesBy5);
//		// lambda
//		int sumOfNumsList = numsList.stream().reduce((accNum, nextNum) -> accNum + nextNum).get();
//		System.out.println(sumOfNumsList);

		List<String> namesList = Arrays.asList("Michael", "Dean", "James", "Chris");

//		Given the following List of names, using a stream, have it print "Hello " in front of each name besides "James".
		namesList.stream().forEach(name -> {
			if (name.contains("James")) {
//	            System.out.println(name);
			} else {
				System.out.println("Hello " + name);
			}
		});

		List<Integer> numbersList = Arrays.asList(3, 4, 7, 8, 12);

		// Given the following List of Integers, using a stream, have it reduce and
		// print the product (all numbers multiplied together).
		int product = numbersList.stream().reduce((a, b) -> a * b).get();
		System.out.println("Product: " + product);

		// Find the max value.
//		int maxNumber = numbersList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		int maxNumber = numbersList.stream().mapToInt(num -> num).max().getAsInt();
		System.out.println("Max number is: " + maxNumber);

		// Find the minimum value.
//		int minNumber = numbersList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		int minNumber = numbersList.stream().mapToInt(num -> num).min().getAsInt();
		System.out.println("Min number is: " + minNumber);

		// Remove the odd numbers
		numbersList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

		// Remove the even numbers
		numbersList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList()).forEach(System.out::println);

		// Find the sum of the list
		int listSum = numbersList.stream().reduce(0, Integer::sum);
		System.out.println("Sum of List: " + listSum);

		// Square every number in the list then remove the even numbers and then find
		// the minimum value.
		int squareNumsNoEvenMinNum = numbersList.stream().map(n -> n * n).filter(n -> n % 2 != 0).mapToInt(num -> num)
				.min().getAsInt();
		System.out.println("Answer is: "+squareNumsNoEvenMinNum);

	}

}
