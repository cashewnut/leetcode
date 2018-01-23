package com.fudanse.leetcode;

public class No11 {
	public int maxArea(int[] height) {
		int maxArea = 0;
		int i = 0, j = height.length - 1;
		while (i < j) {
			maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
			if (height[i] <= height[j])
				i++;
			else
				j--;
		}
		return maxArea;
	}

	public static void main(String[] args) {
		No11 n = new No11();
		System.out.println(n.maxArea(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }));
	}
}
