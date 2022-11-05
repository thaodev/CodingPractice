package Leetcode.Freestyle;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(findMaxSubarray(arr));
	}

	public static int findMaxSubarray(int[] arr) {
		int currentSum = 0;
		int maxSum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
						

		}
		return maxSum;

	}

}
