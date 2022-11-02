package Leetcode.Freestyle;

import java.util.Arrays;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		 int[] arr = {100,4,200,1,3,2};
		 int[] arr2 = {9,1,4,7,3,-1,0,5,8,-1,6};
		System.out.println(findLongestConsecutiveSequence(nums));
		System.out.println(findLongestConsecutiveSequence(arr2));
	}

	public static int findLongestConsecutiveSequence(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int count = 1;
		int maxCount = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				if ((arr[i] - arr[i - 1]) > 1) {
					count = 0;
				}
				count++;
			}
			maxCount = Math.max(maxCount, count);
		}

		return maxCount;
	}

}
