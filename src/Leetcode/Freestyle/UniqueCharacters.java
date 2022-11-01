package Leetcode.Freestyle;

import java.util.Arrays;

public class UniqueCharacters {

	public static void main(String[] args) {
		String word = "ilumina";
		
		System.out.println(isUnique(word));
	}
	
	public static boolean isUnique(String word) {
		boolean[] characters = new boolean[128];
		
		for (int i = 0; i < word.length(); i++) {
			int val = word.charAt(i);
			if (characters[val]) {
				return false;
			}
			characters[val] = true;
		}
		
		//System.out.println("word.charAt(2) " + (int) word.charAt(2));
		return true;
		
	}
	
	

}
