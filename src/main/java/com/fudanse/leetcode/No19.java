package com.fudanse.leetcode;

/**
 * best method is two pointers!!! Method removeNthFromEnd is not the best
 * 
 * @author xiyaoguo
 * @date May 20, 2018 3:20:29 PM
 */

public class No19 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		int length = 0;
		ListNode node = head;
		while (node != null) {
			length++;
			node = node.next;
		}
		if (n > length)
			return head;
		if (n == length)
			return head.next;
		int removeIndex = length - n + 1;
		node = head;
		for (int i = 0; i < removeIndex - 2; i++)
			node = node.next;
		ListNode next = node.next;
		node.next = next.next;
		return head;
	}

	public ListNode removeNthFromEnd2(ListNode head, int n) {
		ListNode first = head;
		while (n-- > 0) 
			first = first.next;
		if(first == null)
			return head.next;
		ListNode second = head;
		while(first.next != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		return head;
	}

}
