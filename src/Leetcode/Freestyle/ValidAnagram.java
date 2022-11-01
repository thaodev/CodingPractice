package Leetcode.Freestyle;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		
		System.out.println(checkValidAnagram(s, t));

	}
	
	public static boolean checkValidAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int [] letters = new int[26];
		for(int i = 0 ; i < s.length() ; i++) {
			letters[s.charAt(i) - 'a']++;
			System.out.println((s.charAt(i) - 'a'));
			letters[t.charAt(i) - 'a']--;
		}
		System.out.println(letters.length);
		for (int count : letters) {
			if (count == 0) {
				return true;
			}
		}
		return false;
	}

}
