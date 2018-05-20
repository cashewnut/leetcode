package pers.xyy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No3 {

	public int lengthOfLongestSubstring(String s) {
		char[] chars = s.toCharArray();
		int max = 0, j = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < chars.length; i++) {
			if (!map.containsKey(chars[i])) {
				map.put(chars[i], i);
				max = Math.max(max, i - j + 1);
			} else {
				j = Math.max(j, map.get(chars[i]) + 1);
				max = Math.max(max, i - j + 1);
				map.put(chars[i], i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		No3 n = new No3();
		System.out.println(n.lengthOfLongestSubstring("pwwkew"));
	}

}
