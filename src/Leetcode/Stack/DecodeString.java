package Leetcode.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		String pattern = "3[a2[c]";
//		System.out.println(decodeString(pattern));
		System.out.println(decodeString2(pattern));
	}
	
	public static String decodeString(String pattern) {
		String result = "";
		Stack<Character> stack = new Stack<>();
		for (int i = 0 ;i < pattern.length(); i++) {
			result = "";
			if (pattern.charAt(i) == ']') {
				while (stack.peek() != '[') {
					result += stack.pop();
					if (Character.isDigit(pattern.charAt(i))) {
						int count = pattern.charAt(i);
						while (count > 0) {
							result += result;
							count --;
						}
					}
				}
				stack.pop();
				for (char c : result.toCharArray()) {
					stack.add(c);
				}
			} else {
				stack.push(pattern.charAt(i));
			}
			
			System.out.println(stack);
		}
		return result;
	}
	
	public static String decodeString2(String s) {
		 Stack<Integer> intStack = new Stack<>();
	        Stack<StringBuilder> strStack = new Stack<>();
	        StringBuilder cur = new StringBuilder();
	        int k = 0;
	        for (char ch : s.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                k = k * 10 + ch - '0';
	            } else if ( ch == '[') {
	                intStack.push(k);
	                strStack.push(cur);
	                cur = new StringBuilder();
	                k = 0;
	            } else if (ch == ']') {
	                StringBuilder tmp = cur;
	                cur = strStack.pop();
	                for (k = intStack.pop(); k > 0; --k) cur.append(tmp);
	            } else cur.append(ch);
	        }
	        return cur.toString();
	}
}
