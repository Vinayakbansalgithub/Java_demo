package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {

	public static void main(String[] args) {
		int arr[] = { 16, 17, 4, 3, 5, 2 };
		find(arr);
	}

	private static void find(int[] arr) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();

		int max = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] > max) {
				list.add(arr[i]);
				max = arr[i];

			}

		}
		
		System.out.println(list);

	}
}
