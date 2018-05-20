package pers.xyy.leetcode;

public class No6 {
	public String convert(String s, int numRows) {
		String res = "";
		if (numRows == 1)
			return s;
		char[] c = s.toCharArray();
		int len = s.length();
		for (int i = 1; i <= numRows; i++) {
			for (int j = 0; 2 * (numRows - 1) * j - i + 1 < len; j++) {
				if (i != 1 && i != numRows) {
					int index1 = 2 * (numRows - 1) * j - i + 1;
					if (index1 >= 0 && index1 < len)
						res += c[index1];
				}
				int index2 = 2 * (numRows - 1) * j + i - 1;
				if (index2 >= 0 && index2 < len)
					res += c[index2];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		No6 n = new No6();
		System.out.println(n.convert("ABCD", 3));
	}
}
