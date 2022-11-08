package Leetcode.Stack;

import java.util.Stack;

public class Stack132Pattern {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		System.out.println(find132Pattern(nums));
	}
	
	public static boolean find132Pattern(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i< nums.length; i++) {
			stack.add(nums[i]);
			if (!stack.isEmpty() && nums[i])
		}
		return false;
	}

}
