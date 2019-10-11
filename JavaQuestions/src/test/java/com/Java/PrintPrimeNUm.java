package com.Java;

public class PrintPrimeNUm {

	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {

			boolean isprime = true;

			for (int j = 2; j < i; j++) {
				if (i % 2 == 0) {

					isprime = false;
					break;
				}
			}
			if(isprime) {
				System.out.println(i);
			}

		}
	}
}