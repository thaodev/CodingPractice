package Leetcode.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String pattern = "{[(})]}";
		System.out.println(checkValidParentheses2(pattern));

	}

	public static boolean checkValidParentheses(String s) {
		if (s.length() % 2 != 0)
			return false;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'))
				return false;
			else {
				if (!stack.isEmpty()) {
					if (stack.peek() == '(' && s.charAt(i) == ')')
						stack.pop();
					else if (stack.peek() == '{' && s.charAt(i) == '}')
						stack.pop();
					else if (stack.peek() == '[' && s.charAt(i) == ']')
						stack.pop();
					else
						stack.add(s.charAt(i));
				} else
					stack.add(s.charAt(i));
			}
		}
		return stack.isEmpty();
	}
	
	public static boolean checkValidParentheses2(String s) {
		Map<Character, Character> map = new HashMap<>();
		Stack<Character> stack = new Stack<>();
		
		map.put(']', '[');
		map.put('}', '{');
		map.put(')', '(');
		
		for (int i = 0 ; i < s.length(); i++) {
			if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'))
				return false;
			else {
				if (!stack.isEmpty()) {
					if (map.containsKey(s.charAt(i))) {
						if (map.get(s.charAt(i)) != stack.pop()) {
							return false;
						}
					} else {
						stack.add(s.charAt(i));
					}
				} else {
					stack.add(s.charAt(i));
				}
			}
		}
		
		return stack.isEmpty();
	}

}
