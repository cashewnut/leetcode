package pers.xyy.leetcode;

public class No10 {
	public boolean isMatch(String t, String p) {
		if (p.isEmpty())
			return t.isEmpty();
		char[] ts = t.toCharArray();
		char[] ps = p.toCharArray();
		boolean pre = !t.isEmpty() && (ts[0] == ps[0] || ps[0] == '.');

		if (ps.length >= 2 && ps[1] == '*') {
			return isMatch(t, p.substring(2)) || pre && isMatch(t.substring(1), p);
		} else {
			return pre && isMatch(t.substring(1), p.substring(1));
		}

	}

	public static void main(String[] args) {
		No10 n = new No10();
		System.out.println(n.isMatch("ab", ".*c"));
	}
}
