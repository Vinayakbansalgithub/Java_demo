package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MajorityElement {
	public static void main(String[] args) {
		int arr[] = { 3, 1, 3, 3, 2 };

		int possible1 = find1(arr);
		System.out.println(possible1);

		find2(arr);
	}

	static int find1(int[] arr) {

		int value = arr[0];
		int count = 1;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == value)
				count++;
			else
				count--;

			if (count == 0) {
				value = arr[i];
				count = 1;
			}

		}

		return value;

	}

	static void find2(int[] arr) {
		// TODO Auto-generated method stub

		int value1 = arr[0];
		int count1 = 1;

		int value2 = arr[0];
		int count2 = 0;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == value1) {
				count1++;
			} else if (arr[i] == value1) {
				count2++;
			} else {
				if (value1 == 0) {
					value1 = arr[i];
					count1 = 1;
				} else if (value2 == 0) {
					value2 = arr[i];
					count2 = 1;
				} else {
					count2--;
					count1--;
				}
			}

		}

		List<Integer> list = new ArrayList<Integer>();
		int count11 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value1)
				count11++;
		}

		if (count11 > arr.length / 3)
			list.add(value1);

		int count22 = 0;
		if (value1 != value2) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == value2)
					count22++;
			}
		}

		if (count22 > arr.length / 3)
			list.add(value1);

		System.out.println(list);

	}

}
