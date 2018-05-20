package pers.xyy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No15 {
	public static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> res = new HashSet<>();
		if (nums == null || nums.length < 3)
			return new ArrayList<>();
		Arrays.sort(nums);
		int i = 0;

		while (i < nums.length - 2) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				int l = i + 1, h = nums.length - 1;
				int sum = 0 - nums[i];
				while (l < h) {
					if (nums[l] + nums[h] < sum)
						l++;
					else if (nums[l] + nums[h] > sum)
						h--;
					else {
						res.add(Arrays.asList(nums[i], nums[l], nums[h]));
						h--;
						l++;
					}
				}
			}
			i++;
		}

		return new ArrayList<>(res);
	}

	public static void main(String[] args) {

		List<List<Integer>> res = threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
		res.forEach((n) -> System.out.println(n.toString()));
	}

}
