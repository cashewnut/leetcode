package pers.xyy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class No13 {

	public static int romanToInt(String s) {
		int res = 0;
		Map<String, Integer> map = new HashMap<>();
		map.put("M", 1000);
		map.put("CM", 900);
		map.put("D", 500);
		map.put("CD", 400);
		map.put("C", 100);
		map.put("XC", 90);
		map.put("L", 50);
		map.put("XL", 40);
		map.put("X", 10);
		map.put("IX", 9);
		map.put("V", 5);
		map.put("IV", 4);
		map.put("I", 1);
		char[] ch = s.toCharArray();
		int length = s.length();
		int i = 0;
		while (i < length) {
			if (i < length - 1) {
				String str = new String(ch, i, 2);
				if(map.containsKey(str)) {
					res += map.get(str);
					i += 2;
				}else {
					res += map.get(str.substring(0, 1));
					i++;
				}
			}else {
				res += map.get(new String(ch,length-1,1));
				break;
			}

		}
		return res;

	}

	public static void main(String[] args) {
		System.out.println(No13.romanToInt("DCXXI"));
	}

}
