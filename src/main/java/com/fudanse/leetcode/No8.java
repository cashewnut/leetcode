package com.fudanse.leetcode;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.omg.CORBA.INTERNAL;

public class No8 {

	public int myAtoi(String str) {
		char[] a = str.toCharArray();
		int i = 0;
		int sign = 0;
		int res = 0;
		while (i < a.length && a[i] == ' ')
			i++;
		if (i < a.length && a[i] == '-') {
			sign = 1;
			i++;
		} else if (i < a.length && a[i] == '+') {
			i++;
		}
		if (i >= a.length || a[i] < '0' || a[i] > '9')
			return 0;
		int temp = i;
		while (i < a.length && a[i] >= '0' && a[i] <= '9') {
			int n = a[i] - '0';
			res = res * 10 + n;
			i++;
			int num = i - temp;
			if (num >= 9) {
				if (i < a.length && a[i] >= '0' && a[i] <= '9') {
					int next = a[i] - '0';
					if (res < Integer.MAX_VALUE / 10)
						continue;
					else if (res == Integer.MAX_VALUE / 10) {
						if (next <= 7 + sign)
							continue;
						else {
							if (sign == 0)
								return Integer.MAX_VALUE;
							else
								return Integer.MIN_VALUE;
						}
					} else {
						if (sign == 0)
							return Integer.MAX_VALUE;
						else
							return Integer.MIN_VALUE;
					}
				}
			}
		}
		if (sign == 0)
			return res;
		else
			return -1 * res;

	}

	public static void main(String[] args) {
		No8 n = new No8();
		System.out.println(n.myAtoi("      -11919730356x"));
	}

}
