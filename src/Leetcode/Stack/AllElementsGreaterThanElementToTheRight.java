package Leetcode.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllElementsGreaterThanElementToTheRight {

	public static void main(String[] args) {
		int[] arr = {20, 4, 17, 35, 5, 7};
		System.out.println(findAllElementsGreaterThanElementsToTheRight(arr));
	}
	
	public static List<Integer> findAllElementsGreaterThanElementsToTheRight(int[] nums) {
		List<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		
		for (int num : nums) {
			while(!stack.isEmpty() && stack.peek() < num) {
				stack.pop();
			}
			stack.add(num);
		}
		for (int num : stack) {
			list.add(num);
		}
		return list;
		
	}

}
