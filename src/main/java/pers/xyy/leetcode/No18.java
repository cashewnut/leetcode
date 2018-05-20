package pers.xyy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No18 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		Set<List<Integer>> res = new HashSet<>();
		int length = nums.length;
		for (int i = 0; i < length - 3; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				int t = target - nums[i];
				for (int j = i + 1; j < length - 2; j++) {
					if (j == i + 1 || nums[j] != nums[j - 1]) {
						int l = j + 1, h = length - 1;
						int sum = t - nums[j];
						while (l < h) {
							if (nums[l] + nums[h] < sum)
								l++;
							else if (nums[l] + nums[h] > sum)
								h--;
							else {
								res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[h]));
								l++;
								h--;
								continue;
							}
						}
					}
				}
			}
		}
		return new ArrayList<>(res);
	}

	public static void main(String[] args) {
		No18 n = new No18();
		n.fourSum(new int[] { -3,-2,-1,0,0,1,2,3 }, 0);
	}

}
