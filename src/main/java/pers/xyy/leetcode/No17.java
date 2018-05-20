package pers.xyy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No17 {

	Map<String, List<String>> map = new HashMap<>();
	{
		map.put("2", Arrays.asList("a", "b", "c"));
		map.put("3", Arrays.asList("d", "e", "f"));
		map.put("4", Arrays.asList("g", "h", "i"));
		map.put("5", Arrays.asList("j", "k", "l"));
		map.put("6", Arrays.asList("m", "n", "o"));
		map.put("7", Arrays.asList("p", "q", "r", "s"));
		map.put("8", Arrays.asList("t", "u", "v"));
		map.put("9", Arrays.asList("w", "x", "y", "z"));
	}

	public List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<>();
		while (!digits.isEmpty()) {
			String key = digits.substring(0, 1);
			digits = digits.substring(1);
			if (res.isEmpty())
				res = map.get(key);
			else
				res = combine(res, map.get(key));

		}
		return res;
	}

	public List<String> combine(List<String> arr1, List<String> arr2) {
		List<String> res = new ArrayList<>();
		for (String str1 : arr1)
			for (String str2 : arr2)
				res.add(str1 + str2);
		return res;
	}
	
	public static void main(String[] args) {
		No17 n = new No17();
		System.out.println(n.letterCombinations("23"));
	}
}
