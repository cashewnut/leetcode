package com.fudanse.leetcode;

public class No5 {
	public String longestPalindrome(String s) {
		if (s.length() == 1)
			return s;
		char[] a = s.toCharArray();
		if (a.length == 2 || a.length == 3) {
			if (a.length == 2) {
				if (a[0] == a[1])
					return "" + a[0] + a[1];
			} else {
				if (a[0] == a[1] && a[0] != a[2])
					return "" + a[0] + a[1];
			}

		}
		int i = 0, j = 0, maxi = 1, maxj = 0;
		boolean o = true;
		for (i = 1; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				j = 1;
				while (i - j >= 0 && i + 1 + j < a.length && a[i - j] == a[i + 1 + j])
					j++;
				j--;
				if (o) {
					if (j >= maxj) {
						maxj = j;
						maxi = i;
						o = false;
					}
				} else {
					if (j > maxj) {
						maxj = j;
						maxi = i;
						o = false;
					}
				}

			}
			if (i > 0 && a[i - 1] == a[i + 1]) {
				j = 1;
				while (i - j >= 0 && i + j < a.length && a[i - j] == a[i + j])
					j++;
				j--;

				if (j > maxj) {
					maxj = j;
					maxi = i;
					o = true;
				}

			}
		}
		String str = "";
		if (o) {
			for (int m = maxi - maxj; m <= maxi + maxj; m++)
				str += a[m];
		} else {
			for (int m = maxi - maxj; m <= maxi + maxj + 1; m++)
				str += a[m];
		}

		return str;
	}

	public static void main(String[] args) {
		No5 n = new No5();
		System.out.println(n.longestPalindrome("aaaa"));
	}

}
