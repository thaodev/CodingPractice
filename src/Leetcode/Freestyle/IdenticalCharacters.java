package Leetcode.Freestyle;

import java.util.HashMap;
import java.util.Map;

public class IdenticalCharacters {

	public static void main(String[] args) {
		String word1 = "permutation";
		String word2 = "permutation2";
		System.out.println(isIdenticalCharacters(word1, word2));
		
		String name = "Mr John Smith";
		String updatedName = name.replaceAll(" ", "%20");
		System.out.println(updatedName);
		
	}
	
	public static boolean isIdenticalCharacters(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> mapS = new HashMap<>();
		Map<Character, Integer> mapT = new HashMap<>();
		for (int i = 0; i< s.length(); i++) {
			mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
			mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
			
		}
		
		return mapS.equals(mapT);
	}

}
