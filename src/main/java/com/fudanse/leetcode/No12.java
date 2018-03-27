package com.fudanse.leetcode;

public class No12 {

	public static String intToRoman(int num) {
		String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] n = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		int length = n.length;

		StringBuilder str = new StringBuilder();
		int i = 0;
		while (num != 0 && i < length) {
			if (num >= n[i]) {
				num -= n[i];
				str.append(roman[i]);
			} else {
				i++;
			}
		}

		return str.toString();

	}

	public static void main(String[] args) {
		System.out.println(No12.intToRoman(99));
	}

}
