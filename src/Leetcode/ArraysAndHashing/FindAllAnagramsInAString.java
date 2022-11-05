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
		for (int leftIndex = 0; leftIndex < s.length(); leftIndex++) {
			sMap.put(s.charAt(leftIndex), sMap.getOrDefault(s.charAt(leftIndex),0) + 1);
			
			if (leftIndex >= p.length()) {
				char ch = s.charAt(leftIndex - p.length());
				if (sMap.get(ch) == 1) {
					sMap.remove(ch);
				} else {
					sMap.put(ch, sMap.get(ch) - 1);
				}
			}
			System.out.println("sMAP" + sMap);
			if (sMap.equals(pMap)) {
				indices.add(leftIndex - p.length()+1);
			}
		}
		return indices;
		
	}
	public static List<Integer> findAllAnagrams3(String s, String p) {
		 int ns = s.length(), np = p.length();
		    if (ns < np) return new ArrayList();

		    Map<Character, Integer> pCount = new HashMap();
		    Map<Character, Integer> sCount = new HashMap();
		    // build reference hashmap using string p
		    for (char ch : p.toCharArray()) {
		      if (pCount.containsKey(ch)) {
		        pCount.put(ch, pCount.get(ch) + 1);
		      }
		      else {
		        pCount.put(ch, 1);
		      }
		    }

		    List<Integer> output = new ArrayList();
		    // sliding window on the string s
		    for (int i = 0; i < ns; ++i) {
		      // add one more letter 
		      // on the right side of the window
		      char ch = s.charAt(i);
		      if (sCount.containsKey(ch)) {
		        sCount.put(ch, sCount.get(ch) + 1);
		      }
		      else {
		        sCount.put(ch, 1);
		      }
		      // remove one letter 
		      // from the left side of the window
		      if (i >= np) {
		        ch = s.charAt(i - np);
		        if (sCount.get(ch) == 1) {
		          sCount.remove(ch);
		        }
		        else {
		          sCount.put(ch, sCount.get(ch) - 1);
		        }
		      }
		      // compare hashmap in the sliding window
		      // with the reference hashmap
		      if (pCount.equals(sCount)) {
		        output.add(i - np + 1);
		      }
		    }
		    return output;
	}
}
