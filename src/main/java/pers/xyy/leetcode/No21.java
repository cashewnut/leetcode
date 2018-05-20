package pers.xyy.leetcode;

public class No21 {
	

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		ListNode head;
		if (l1.val <= l2.val) {
			head = l1;
			l1 = l1.next;
		}else {
			head = l2;
			l2 = l2.next;
		}
		ListNode cur = head;
		while (l1 != null || l2 != null) {
			if (l1 == null && l2 != null) {
				cur.next = l2;
				l2 = l2.next;
				cur = cur.next;
			} else if (l1 != null && l2 == null) {
				cur.next = l1;
				l1 = l1.next;
				cur = cur.next;
			} else {
				if(l1.val<=l2.val) {
					cur.next = l1;
					l1 = l1.next;
					cur = cur.next;
				}else {
					cur.next = l2;
					l2 = l2.next;
					cur = cur.next;
				}
			}
		}
		return head;

	}
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n12 = new ListNode(2);
		ListNode n13 = new ListNode(4);
		ListNode n22 = new ListNode(3);
		ListNode n23 = new ListNode(4);
		n1.next = n12;
		n12.next = n13;
		n2.next = n22;
		n22.next = n23;
		new No21().mergeTwoLists(n1, n2);
		
	}
}
