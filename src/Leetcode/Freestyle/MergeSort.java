package Leetcode.Freestyle;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int [] arr = {38, 27, 43, 3, 9, 82, 10};
		mergeSort(arr);

	}
	
	private static void mergeSort(int[] inputArray) {
		int inputLength = inputArray.length;
		
		if (inputLength < 2) {
			return;
		}
		
		int midIndex = inputLength/2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		for (int i = 0 ; i < midIndex ; i++) {
			leftHalf[i] = inputArray[i];
		}
		for (int i = midIndex ; i < inputLength ; i++) {
			rightHalf[i - midIndex] = inputArray[i];
		}
		System.out.println(Arrays.toString(leftHalf));
		System.out.println(Arrays.toString(rightHalf));
		System.out.println();
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		merge(inputArray, leftHalf, rightHalf);
		
	}
	
	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int i = 0, j = 0, k = 0;
		while (i < leftHalf.length && j < rightHalf.length) {
			if (leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			} else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
			
		}
		while (i < leftHalf.length) {
			inputArray[k++] = leftHalf[i++];
			
		}
		
		while (j < rightHalf.length) {
			inputArray[k++] = rightHalf[j++];
		}
		
		System.out.println(Arrays.toString(inputArray));
		
	}

}
