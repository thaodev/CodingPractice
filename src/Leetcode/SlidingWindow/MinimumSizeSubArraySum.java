package Leetcode.SlidingWindow;

public class MinimumSizeSubArraySum {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 2, 4, 3 };
		int[] arr2 = {1, 2, 3, 4, 5};
		System.out.println(findMinSizeSubArraySum(11, arr2));
	}

	public static int findMinSizeSubArraySum(int target, int[] num) {
		int min = num.length;
		int sum = 0;
		int left = 0;
		int allSum = 0;
		for (int i = 0; i < num.length; i++) {
			allSum += num[i];
			sum += num[i];
			while (sum >= target && left < num.length) {
				min = Math.min(min, i - left + 1);
				sum -= num[left];
					left++;
			}
		}

		if (allSum < target)
			min = 0;

		return min;
	}

}
