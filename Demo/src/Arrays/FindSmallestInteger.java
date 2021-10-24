package Arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/find-smallest-value-represented-sum-subset-given-array/
public class FindSmallestInteger {

	static int findSmallest(int arr[])

	{

		Arrays.sort(arr);
		int res = 1;

		for (int i : arr) {
			if (res < i)
				return res;

			res += i;

		}

		return res - 1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 3, 4 };

		int res = findSmallest(arr);
		System.out.println(res);
	}
}
