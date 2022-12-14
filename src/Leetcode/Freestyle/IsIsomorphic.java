package Leetcode.Freestyle;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {

	public static void main(String[] args) {
		String s = "paper";
		String t = "tifle";
		System.out.println(checkIsIsomorphic(s, t));

	}
	
	public static boolean checkIsIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		if (s.length() != t.length()) {
			return false;
		}
		for (int i = 0 ; i < s.length() ; i++) {
			if (map.containsKey(s.charAt(i))) {
				if (map.get(s.charAt(i)) != t.charAt(i) ) {
					return false;
				}
			} else {
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}
	
	public static boolean checkIsIsomorphic2(String s, String t) {
        if (s.length() != t.length()) return false;
        Map map = new HashMap();
         Map mapT = new HashMap();
        for (int i =0 ; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            }
            if (!mapT.containsKey(t.charAt(i))) {
                mapT.put(t.charAt(i), i);
            }
            if (map.get(s.charAt(i)) != mapT.get(t.charAt(i))) return false;
        }
        return true;
	}

}
