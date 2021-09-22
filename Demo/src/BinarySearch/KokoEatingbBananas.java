package BinarySearch;

import java.util.Arrays;

public class KokoEatingbBananas {

	private static boolean canEat(int[] arr, int h, int mid) {

		int div = 0;
		
		int sum=0;

		for (int i = 0; i < arr.length; i++) {

			div =arr[i]/mid;
			int rem =arr[i]% mid;

			if (rem != 0) {
				div++;

			}
			
			sum+=div;
		}

		if (sum <= h)
			return true;

		return false;
	}

	private static void minK(int[] arr, int h) {

		// get Max value

		int minRange = 1;
		int MaxRange = Arrays.stream(arr).max().getAsInt();
		System.out.println("min is " + minRange + "  max is " + MaxRange);

		int possibleAnswer = 0;
		while (minRange < MaxRange) {

			int mid = minRange + (MaxRange - minRange) / 2;

			if (canEat(arr, h, mid)) {
				possibleAnswer = mid;
				MaxRange = mid - 1;
			} else {
				minRange = mid + 1;
			}

		}

		System.out.println("min hours req " + possibleAnswer);

	}

	public static void main(String[] args) {
		int arr[] = { 3, 6, 7, 11 };
		// number of hours
		int h = 8;
		minK(arr, h);
	}
}
