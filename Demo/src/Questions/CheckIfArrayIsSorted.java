package Questions;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class CheckIfArrayIsSorted {

	static boolean isSorted(int[] arr, int start, int end) {

		boolean result = false;
		if (start >= end) {
			return true;
		}
		if (arr[start] < arr[start + 1]) {
			result = isSorted(arr, start + 1, end);
		} 
		
		return result;

	}

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		int totalElements = Integer.parseInt(scanner.nextLine().trim());
		String arrayString = scanner.nextLine();
		String arrayStringarr[] = arrayString.split(" ");
		int arr[] = new int[arrayStringarr.length];
		int index = 0;
		for (String i : arrayStringarr) {
			arr[index] = Integer.parseInt(i.trim());
			index++;
		}

		
		
		boolean result = isSorted(arr, 0, arr.length - 1);
		

	}

	
}
