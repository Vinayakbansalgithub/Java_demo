package Recurssion;

import java.util.Arrays;
import java.util.Base64;

public class AllCombinationofArray_LargestNumeberOfArray {

	static int max = 0;

	int arrayToInt(int[] arr) {
		
		StringBuilder s = new StringBuilder();
		for (int i : arr) {
			s.append(i); 
		}
		return Integer.parseInt(s.toString()); // parse integer out of the string
	}

	public static void main(String[] args) {
//		int arr[] = { 9, 34, 8 };
//		int n = arr.length;
//		AllCombinationofArray_LargestNumeberOfArray permutation = new AllCombinationofArray_LargestNumeberOfArray();
//		permutation.permute(arr, 0, n -1);
//		System.out.println("number is " + max);
		
		
		
		String originalInput = "58";
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		encodedString=encodedString+"uYy5teXNxbA==";
		System.out.println(encodedString);

	}

	private void permute(int arr[], int l, int r) {
		if (l == r) {
			System.out.println(Arrays.toString(arr));
			if (max < arrayToInt(arr))
				max = arrayToInt(arr);
		} else {
			for (int i = l; i <= r; i++) {
				
				arr = swap(arr, i, l);
				permute(arr, l + 1, r);
				arr = swap(arr, i, l);

			}
		}
	}

	public int[] swap(int arr[], int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

}
