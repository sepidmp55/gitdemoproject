package com.Java;

public class PrimeNumber {
	
	
	
	public static boolean findPrimeNumber(int num) {
		
		if(num<=1) {
			return false;}
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
			
			
		}
		return true;
		
		}
	
	public static void main(String[] args) {
		findPrimeNumber(17);
		System.out.println("The number is prime");
		
	}
	}


