package pers.xyy.leetcode;

public class No9 {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		char[] a = (x + "").toCharArray();
		int len = a.length;
		int i, j = len / 2;
		if (len % 2 == 1)
			i = j;
		else
			i = j - 1;
		while (i >= 0 && j < len) {
			if (a[i] != a[j])
				return false;
			i--;
			j++;
		}
		return true;

	}

	public static void main(String[] args) {
		No9 n = new No9();
		System.out.println(n.isPalindrome(-121));
	}

}
