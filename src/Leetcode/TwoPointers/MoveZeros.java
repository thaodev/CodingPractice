package Leetcode.TwoPointers;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 6, 7, 0, 13, 0, 31};
		System.out.println(Arrays.toString(moveZeroes(arr)));
	}
	 public static int[] moveZeroes(int[] nums) {
	        int numberOfZero = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] == 0) {
	                numberOfZero ++;
	            } else {
	                int temp = nums[i];
	                nums[i] = nums[i-numberOfZero];
	                nums[i-numberOfZero] = temp;
	            }
	        }
	        return nums;
	        
	        
	    }
}
