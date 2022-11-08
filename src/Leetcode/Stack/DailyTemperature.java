package Leetcode.Stack;

import java.util.Arrays;
import java.util.Stack;

class Tuple {
	public int index;
	public int value;

	public Tuple(int index, int value) {
		this.index = index;
		this.value = value;
	}

	public Tuple() {
	}
}

public class DailyTemperature {

	public static void main(String[] args) {
		Stack<Integer> stack2 = new Stack<>();

		int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
//		for (int item : temperatures) {
//			stack2.add(item);
//		}
//		System.out.println(stack2);
//		stack2.pop();
//		System.out.println("After popping" + stack2);
		System.out.println(Arrays.toString(findNumOfDaysToWarmerTemperature(temperatures)));
	}

	public static int[] findNumOfDaysToWarmerTemperature(int[] temperatures) {
		int[] result = new int[temperatures.length];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < temperatures.length; i++) {
			int currentTemp = temperatures[i];
			while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemp) {
				int prevDay = stack.pop();
				result[prevDay] = i - prevDay;
			}
			stack.push(i);
			if (!stack.isEmpty()) {
				System.out.println("i = " + i + " " + stack.peek());
			}
		}

		return result;
	}

}
