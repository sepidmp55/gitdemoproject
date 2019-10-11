package com.Java;

public class PositiveOrNegative {
	public static void main(String[] args) {
		PositiveOrNegative obj=new  PositiveOrNegative();
		obj.negOrPos(0);
		
	}
	public void negOrPos(int value) {
		if(value>0) {
			System.out.println("the number is pos");
		}
		else if(value<0) {
			System.out.println("the number is neg");
		}
		else {
			System.out.println("the number is zero");
		}
	}

}
