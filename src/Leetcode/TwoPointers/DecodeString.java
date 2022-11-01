package Leetcode.TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123";
		System.out.println(decodeString(s));
		//System.out.println(assignNumToString());
	}
	
	/**
	 * Input: s = "3[a]2[bc]"
		Output: "aaabcbc"
		
	 */
	public static String decodeString(String str) {
		String result = "";
		
		char[] c = str.toCharArray();
		int left = 0;
		char right = 0;
		int count = 0;
		
		for (int i = 0;i < c.length; i ++) {
			if (Character.isLetterOrDigit(c[i])) {
				count = c[i];
			}
			if (c[i] == '[') {
				left = c[i];
				
			}
		}
		
		return result;
	}
	
	

}
