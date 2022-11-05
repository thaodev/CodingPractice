package Leetcode.Freestyle;

public class PerfectNumber {
	/**
	 * is positive integer that is equal to the sum of all its positive divisors except itself
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(28));

	}
	
	public static boolean checkPerfectNumber(int num) {
		int sum = 0;
		for (int i = 1 ; i*i <= num;i++) {
			if (num % i == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
		return sum == num;
	}

}
