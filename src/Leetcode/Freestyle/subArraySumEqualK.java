package Leetcode.Freestyle;

import java.util.HashMap;
import java.util.Map;

public class subArraySumEqualK {

	public static void main(String[] args) {
		int[] arr = {36, 12, -1, 5, 1, 30, 5, 15, 36};
		System.out.println(findSubArraySumEqualK(arr, 36));
	}
	/**
	 * if we found k is the difference between two consecutive sums of two indices. 
	 * any index between those two would be the subarray that add up to k
	 
	 */
	public static int findSubArraySumEqualK(int[] nums, int k) {
		  int count = 0, sum = 0;
	        HashMap < Integer, Integer > map = new HashMap < > ();
	        map.put(0, 1);
	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];
	            if (map.containsKey(sum - k))
	                count += map.get(sum - k);
	            map.put(sum, map.getOrDefault(sum, 0) + 1);
	        }
	        return count;
	}

}
