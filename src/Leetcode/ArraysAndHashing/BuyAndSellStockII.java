package Leetcode.ArraysAndHashing;

public class BuyAndSellStockII {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(findMaxProfit(prices));
	}
	
	public static int findMaxProfit(int[] prices) {
		int localMin = 0, localMax = 0, profit = 0, sum = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			profit = 0;
			if (prices[i + 1] > prices[i]) {
				localMin = prices[i];
				localMax = prices[i+1];
				profit = localMax - localMin;
			} 			
			sum += profit;
		}
		return sum;
	}

}
