package com.Java;

public class ReverseString {

	public static void main(String[] args) {
		String s = "welcome";
		int len = s.length();
		String rev = "";

		for (int i=len-1;i>=0; --i) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

	}

}
