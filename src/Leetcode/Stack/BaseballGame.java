package Leetcode.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {
		String arr[] = {"5","2","C","D","+"};
		System.out.println(calculateBaseballGame(arr));

	}
	
	public static int calculateBaseballGame(String[] arr) {
		Stack<Integer> stack = new Stack<>();
		Queue queue = new LinkedList();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("+")) {
				int top = stack.pop();
				int secondTop = stack.pop();
				stack.add(secondTop);
				stack.add(top);
				stack.add(secondTop + top);
			} else if (arr[i].equals("D")) {
				int top = stack.peek();
				stack.add(top *2);
			} else if (arr[i].equals("C")) {
				stack.pop();
			} else {
				stack.add(Integer.parseInt(arr[i]));
			}
		}
		int sum = 0;
		for (Integer item : stack) {
			sum += item;
		}
		return sum;
	}

}
