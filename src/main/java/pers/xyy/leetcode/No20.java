package pers.xyy.leetcode;

import java.util.Stack;

public class No20 {

	public boolean isValid(String s) {
		if (s.isEmpty())
			return true;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!isRight(c)) {
				stack.push(new Character(c));
			} else {
				if(stack.empty())
					return false;
				char left = stack.peek();
				if(c=='}') {
					if(left != '{')
						return false;
					stack.pop();
				}else if(c==']') {
					if(left != '[')
						return false;
					stack.pop();
				}else if(c==')') {
					if(left != '(')
						return false;
					stack.pop();
				}
			}
		}
		if(stack.empty())
			return true;
		return false;
	}

	public boolean isRight(char c) {
		return c == '}' || c == ')' || c == ']';
	}

}
