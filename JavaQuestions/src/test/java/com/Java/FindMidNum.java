package com.Java;

public class FindMidNum {
	public static void main(String[] args) {

		int i1 = 1;
		int j1 = 11;
		while (++i1 < --j1)
			;
		System.out.println(i1);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j > 3) {
					break;
				}
				System.out.print(j);
			}
		}
	}
}