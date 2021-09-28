package ArrayQuestions;

import java.util.Arrays;

public class Median {

	public static double findMedian(int a[], int n) {
		// First we sort the array
		Arrays.sort(a);

		// check for even case
		if (n % 2 != 0)
			return (double) a[n / 2];

		return (double) (a[(n - 1) / 2] + a[n / 2]) / 2.0;
	}

	public static void main(String args[]) {
		int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
		int n = a.length;

		double median = findMedian(a, n);
		median = java.lang.Math.ceil(median);
		System.out.println("Median = " + median);

		a = Arrays.copyOfRange(a, 1, 4); // returns {3, 4,2}
		n = a.length;
		median = findMedian(a, n);
		median = java.lang.Math.ceil(median);
		System.out.println("Median = " + median);

	}
}
