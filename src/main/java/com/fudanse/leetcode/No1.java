package com.fudanse.leetcode;

public class No1 {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 13 };
		int[] res = twoSum(nums, 9);
		System.out.println(res[0] + " " + res[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					res[0] = i;
					res[1] = j;
					break;
				}
			}
		}
		return res;
	}

}
