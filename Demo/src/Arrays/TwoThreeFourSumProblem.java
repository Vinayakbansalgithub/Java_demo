package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TwoThreeFourSumProblem {

	static ArrayList<ArrayList<Integer>> twoSum(int arr[], int sum, int startIndex) {

		Set<Integer> set = new HashSet<>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		for (int i = startIndex; i < arr.length; i++) {

			int complement = sum - arr[i];

			ArrayList<Integer> current = new ArrayList<>();
			if (set.contains(complement)) {

				current.add(complement);
				current.add(arr[i]);
				list.add(current);

			}

			set.add(arr[i]);

		}
		return list;

	}

	static ArrayList<ArrayList<Integer>> threeSum(int arr[], int sum, int startIndex) {

		Set<Integer> set = new HashSet<>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		for (int i = startIndex; i < arr.length; i++) {

			ArrayList<ArrayList<Integer>> resOfTowSum = twoSum(arr, sum - arr[i], i + 1);

			for (ArrayList<Integer> superList : resOfTowSum) {

				int currSum = arr[i];
				for (Integer value : superList) {
					currSum += value;
				}
				if (currSum == sum) {
					superList.add(arr[i]);
					list.add(superList);
				}

			}

		}
		return list;

	}

	static ArrayList<ArrayList<Integer>> fourSum(int arr[], int sum, int startIndex) {

		Set<Integer> set = new HashSet<>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		for (int i = startIndex; i < arr.length; i++) {

			ArrayList<ArrayList<Integer>> resOfThreeSum = threeSum(arr, sum - arr[i], i + 1);

			for (ArrayList<Integer> superList : resOfThreeSum) {

				int currSum = arr[i];
				for (Integer value : superList) {
					currSum += value;
				}
				if (currSum == sum) {
					superList.add(arr[i]);
					list.add(superList);
				}

			}

		}
		return list;

	}

	public static void main(String[] args) {
		
		String normalizedFoundValue="500,00";
		
		 String regex = "(^[0-9,]*$)";
         Pattern p = Pattern.compile(regex);
         Matcher m = p.matcher(normalizedFoundValue);
         if ( m.find()) {
        	 System.out.println(normalizedFoundValue + " is a valid integer number");
        	 normalizedFoundValue=normalizedFoundValue.replaceAll(",", "");
             System.out.println("updated normalizedFoundValue "+ normalizedFoundValue);
             
         }else
        	 System.out.println("not foumd");
             
             

//		int arr1[] = { 0, -1, 2, -3, 1 };
//		int sum1 = -2;
//		System.out.println("given sum is " + sum1);
//		ArrayList<ArrayList<Integer>> res1 = twoSum(arr1, sum1, 0);
//		System.out.println("two sum is " + res1);
//
//		int arr2[] = { 1, 4, 45, 6, 10, 8 };
//		int sum2 = 22;
//
//		ArrayList<ArrayList<Integer>> res2 = threeSum(arr2, sum2, 0);
//		System.out.println("three sum is " + res2);
//
//		int arr3[] = { 1, 4, 45, 6, 10, 8 };
//		int sum3 = 23;
//
//		ArrayList<ArrayList<Integer>> res3 = fourSum(arr3, sum3, 0);
//		System.out.println("three sum is " + res3);
	}
}
