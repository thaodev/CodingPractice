package Leetcode.Freestyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(checkGroupAnagram(strs));
	}
	
	public static List<List<String>> checkGroupAnagram(String[] arr){
		Map<String, ArrayList<String>> map = new LinkedHashMap<>();
		
		for (String string : arr) {
			
			if (!map.containsKey(sortedString(string))) {
				map.put(sortedString(string), new ArrayList<String>());
			}
			map.get(sortedString(string)).add(string);
		}
		System.out.println(map.values());
		
		return new ArrayList(map.values());
		
	}
	
	public static String sortedString(String word) {
		char [] characters = word.toCharArray();
		Arrays.sort(characters);
		String sortedWord = "";
		for(char c : characters) {
			sortedWord += c;
		}
		return sortedWord;
	}

}
