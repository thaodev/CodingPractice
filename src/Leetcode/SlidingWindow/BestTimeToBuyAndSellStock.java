package Leetcode.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] arr = {1,4,1,4,3,1};
		System.out.println(findProfit(arr));

	}
	
	public static int findProfit(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int maxProfit = 0;
		int smallestPrice = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (smallestPrice > arr[i]) {
				smallestPrice = arr[i];
			} else {
				maxProfit = Math.max(arr[i] - smallestPrice, maxProfit);
			}
						
		}
		
		
		return maxProfit;
	}

}
