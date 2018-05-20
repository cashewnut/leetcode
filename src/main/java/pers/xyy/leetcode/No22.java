package pers.xyy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No22 {
	public List<String> generateParenthesis(int n) {
		if(n==0)
			return Arrays.asList("");
		List<String> res = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			for(String left : generateParenthesis(i))
				for(String right : generateParenthesis(n-i-1))
					res.add("(" + left + ")" + right);
		}
		
		return res;
	}
}
