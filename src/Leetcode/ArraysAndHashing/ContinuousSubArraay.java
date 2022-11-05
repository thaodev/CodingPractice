package Leetcode.ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubArraay {

	public static void main(String[] args) {
		int[] arr = {23,2,4,6,7};
		
		System.out.println(checkContinuousSubArray(arr, 6));
	}
	
	public static boolean checkContinuousSubArray(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for (int i = 0 ; i < arr.length; i++) {
			sum += arr[i];
			if (!map.containsKey(sum % k)) {
				map.put(sum % k,i+1);
			} else if (map.get(sum % k) < i) {
				return true;
			}
		}
		
		return false;
	}

}
