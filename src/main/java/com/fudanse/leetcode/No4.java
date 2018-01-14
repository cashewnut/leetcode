package com.fudanse.leetcode;

public class No4 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		if (m == 0) {
			if (n % 2 == 1)
				return nums2[n / 2];
			else
				return  ((double)(nums2[n / 2] + (double)nums2[n / 2 - 1]) / 2);
		}
		if (n == 0) {
			if (m % 2 == 1)
				return nums1[m / 2];
			else
				return (((double)nums1[m / 2] + (double)nums1[m / 2 - 1]) / 2);
		}
		int sum = m + n;
		int i = 0, j = sum / 2 - i;
		for (; i <= m; i++) {
			j = sum / 2 - i;
			if (j > n || j < 0)
				continue;
			if (max(i - 1, j - 1, nums1, nums2) <= min(i, j, nums1, nums2))
				break;
		}
		if (sum % 2 == 1)
			return min(i, j, nums1, nums2);
		else
			return (double) ((max(i - 1, j - 1, nums1, nums2) + min(i, j, nums1, nums2)) / 2);

	}

	public double min(int i, int j, int[] a, int[] b) {
		if (i >= a.length)
			return b[j];
		else if (j >= b.length)
			return a[i];
		else
			return Math.min(a[i], b[j]);
	}

	public double max(int i, int j, int[] a, int[] b) {
		if (i < 0)
			return b[j];
		else if (j < 0)
			return a[i];
		else
			return Math.max(a[i], b[j]);
	}

	public static void main(String[] args) {
		No4 n = new No4();
		int a[] = {};
		int b[] = { 2, 3 };
		System.out.println(n.findMedianSortedArrays(a, b));
	}

}
