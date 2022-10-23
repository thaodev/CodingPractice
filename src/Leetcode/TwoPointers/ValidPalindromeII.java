package Leetcode.TwoPointers;

public class ValidPalindromeII {

	public static void main(String[] args) {
		String s = "abcdedcbcda";
		 System.out.println(checkValidPalindromeII(s));
		//System.out.println(checkPalindrom("abcdecba", 0, 6));
	}

	/**
	 * Given a string s, return true if the s can be palindrome after deleting at
	 * most one character from it.
	 */
	private static boolean checkValidPalindromeII(String s) {
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				//String subString = s.substring(i, j);
				return checkPalindrom(s, i + 1, j) || checkPalindrom(s, i, j -1);
			}
			i++;
			j--;

		}
		return false;
	}

	private static boolean checkPalindrom(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
