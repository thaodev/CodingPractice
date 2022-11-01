package Leetcode.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationInString {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidboaooo";
		System.out.println(checkPermutation(s1, s2));
		
		System.out.println(s2.substring(3));
		System.out.println(sort(s2));
	}
	
	public static boolean checkPermutation(String s, String t) {
		s = sort(s);
		for (int i = 0 ; i <= t.length() - s.length(); i++) {
			String substring = t.substring(i, i + s.length());
			if (s.equals(substring)) {
				return true;
			}
			
		}
		
		return false;
	}
	
	public static String sort(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		
		return new String(c);
	}

}
