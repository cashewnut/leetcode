package pers.xyy.leetcode;

import java.util.Arrays;

public class No16 {

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int res = Integer.MAX_VALUE;
		int a = Integer.MAX_VALUE;
		int i = 0;
		while (i < nums.length - 2) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				int lo = i + 1, hi = nums.length - 1, div = target - nums[i];
				while (lo < hi) {
					if (nums[lo] + nums[hi] < div) {
						int b = div - nums[lo] - nums[hi];
						if (b < a) {
							a = b;
							res = nums[i] + nums[lo] + nums[hi];
						}
						lo++;
					} else if (nums[lo] + nums[hi] > div) {
						int b = nums[lo] + nums[hi] - div;
						if (b < a) {
							a = b;
							res = nums[i] + nums[lo] + nums[hi];
						}
						hi--;
					} else
						return target;
				}
			}
			i++;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(threeSumClosest(new int[] { 1, 1, 1,0 }, 100));
	}

}
