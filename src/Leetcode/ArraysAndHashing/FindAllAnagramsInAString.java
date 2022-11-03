package Leetcode.ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {

	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		String check = "bae";
		System.out.println(findAllAnagrams2(s, p));
		//System.out.println(checkAnagram(p, check));
		
	}
	
	public static List<Integer> findAllAnagrams(String s, String p) {
		List<Integer> indices = new ArrayList<>();
		
		int limit = s.length() - p.length() + 1;
		for(int i = 0; i < s.length() - p.length() + 1; i++) {
			String subString = s.substring(i,i + p.length());
			System.out.println(subString);
			if(checkAnagram(p, subString)) {
				indices.add(i);
			}
		}
		return indices;
	}
	
	public static boolean checkAnagram(String p, String check) {
		char[] charP = p.toCharArray();
		Arrays.sort(charP);
		String sortedP = String.valueOf(charP);
		//System.out.println(sortedP);
		
		char[] charCheck = check.toCharArray();
		Arrays.sort(charCheck);
		String sortedCheck = String.valueOf(charCheck);
		//System.out.println(sortedCheck);
		
		return sortedP.equals(sortedCheck);
		
	}
	
	public static List<Integer> findAllAnagrams2(String s, String p) {
		List<Integer> indices = new ArrayList<>();
		Map<Character, Integer> pMap = new HashMap<>();
		Map<Character, Integer> sMap = new HashMap<>();
		
		for (int i = 0; i< p.length(); i++) {
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
			System.out.println(pMap);
			
		}
		for (int leftIndex = 0; leftIndex < s.length() - p.length() + 1; leftIndex++) {
			int rightIndex = leftIndex + p.length() -1;
			int i = leftIndex;
			sMap = new HashMap<>();
			while (i <= rightIndex) {
				sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
				i++;
			}
			System.out.println("sMAP" + sMap);
			if (sMap.equals(pMap)) {
				indices.add(leftIndex);
			}
		}
		return indices;
		
	}
}
