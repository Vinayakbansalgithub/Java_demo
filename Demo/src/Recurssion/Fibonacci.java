package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Fibonacci {
	
	
	static int arr[];

	
	
	 
	static void printFib(int i) {
		// TODO Auto-generated method stub
		arr = new int[i];
		arr[1] = 1;
		for (int j = 2; j < i; j++) {
			arr[j] = arr[j - 1] + arr[j - 2];
		}
		System.out.println(Arrays.toString(arr));
	}
	 
	static int printFibAtIndex(int index) {
		// base case
		if (index == 1 || index == 0) {
			return index;
		}
		int i = printFibAtIndex(index - 1);
		int j = printFibAtIndex(index - 2);

		return i + j;

	}
public static void main(String[] args) {
	//	printFib(10);
	System.out.println(printFibAtIndex(7));

	// 0 1 1 2 3 5 8 13
}



}
