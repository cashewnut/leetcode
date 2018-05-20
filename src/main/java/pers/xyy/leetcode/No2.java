package pers.xyy.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2 {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = null, node = null,pre = null;
		int carry = 0;
		while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val + carry;
			int quotient = sum % 10;
			carry = sum / 10;
			node = new ListNode(quotient);
			if(pre != null)
				pre.next = node;
			else
				res = node; 
			pre = node;
			l1 = l1.next;
			l2 = l2.next;
		}
		if(l1 == null) {
			while(l2 != null) {
				int sum = l2.val + carry;
				int quotient = sum % 10;
				carry = sum / 10;
				node = new ListNode(quotient);
				pre.next = node;
				pre = node;
				l2 = l2.next;
			}
		}
		if(l2 == null) {
			while(l1 != null) {
				int sum = l1.val + carry;
				int quotient = sum % 10;
				carry = sum / 10;
				node = new ListNode(quotient);
				pre.next = node;
				pre = node;
				l1 = l1.next;
			}
		}
		if(l1 == null && l2 == null) {
			if(carry != 0) {
				node = new ListNode(carry);
				pre.next = node;
			}
		}
		return res;
	}

	public static int[] stringToIntegerArray(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return new int[0];
		}

		String[] parts = input.split(",");
		int[] output = new int[parts.length];
		for (int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			output[index] = Integer.parseInt(part);
		}
		return output;
	}

	public static ListNode stringToListNode(String input) {
		// Generate array from the input
		int[] nodeValues = stringToIntegerArray(input);

		// Now convert that list into linked list
		ListNode dummyRoot = new ListNode(0);
		ListNode ptr = dummyRoot;
		for (int item : nodeValues) {
			ptr.next = new ListNode(item);
			ptr = ptr.next;
		}
		return dummyRoot.next;
	}

	public static String listNodeToString(ListNode node) {
		if (node == null) {
			return "[]";
		}

		String result = "";
		while (node != null) {
			result += Integer.toString(node.val) + ", ";
			node = node.next;
		}
		return "[" + result.substring(0, result.length() - 2) + "]";
	}

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while ((line = in.readLine()) != null) {
				ListNode l1 = stringToListNode(line);
				line = in.readLine();
				ListNode l2 = stringToListNode(line);

				ListNode ret = new No2().addTwoNumbers(l1, l2);

				String out = listNodeToString(ret);

				System.out.print(out);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
