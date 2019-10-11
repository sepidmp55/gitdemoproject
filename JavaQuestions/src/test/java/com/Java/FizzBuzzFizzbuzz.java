package com.Java;

public class FizzBuzzFizzbuzz {
	public static void main(String[] args) {
		fizz(9);

	}

	public static void fizz(int value) {
		
		if (value % 3 == 0) {
			System.out.println("fizz");

		} else if (value % 5 == 0) {
			System.out.println("buzz");
		} else if (value % 15 == 0) {
			System.out.println("fizzbuzz");

		} else {
			System.out.println("invalid");
		}

	}

}
