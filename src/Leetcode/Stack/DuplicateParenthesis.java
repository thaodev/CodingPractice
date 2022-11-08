package Leetcode.Stack;

import java.util.Stack;

public class DuplicateParenthesis {

	public static void main(String[] args) {
		String pattern = "((x+y)+(x))";
		System.out.println(findDuplicateParenthesis(pattern));
	}
	
	public static boolean findDuplicateParenthesis(String exp) {
		 if (exp == null || exp.length() <= 3) {
	            return false;
	        }
	 
	        // take an empty stack of characters
	        Stack<Character> stack = new Stack<>();
	 
	        // traverse the input expression
	        for (char c: exp.toCharArray())
	        {
	            // if the current char in the expression is not a closing parenthesis
	            if (c != ')') {
	                stack.push(c);
	            }
	            // if the current char in the expression is a closing parenthesis
	            else {
	            	
	                // if the stack's top element is an opening parenthesis,
	                // the subexpression of the form ((exp)) is found
	                if (!stack.isEmpty() && stack.peek() == '(') {
	                    return true;
	                }
	 
	                // pop till '(' is found for current ')'
	                while (stack.peek() != '(') {
	                    stack.pop();
	                }
	 
	                // pop '('
	                stack.pop();
	            }
	        }
	       
	        // if we reach here, then the expression does not have any
	        // duplicate parenthesis
	        return false;
	}

}
