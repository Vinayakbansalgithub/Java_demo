package Recurssion;

public class PrintNnumbersRecurssion {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 2, 4, 6, 8 };
		print(arr, 0, arr.length - 1);
	}

	static void print(int[] arr, int start, int end) {

		if (start == end) {
			System.out.println(arr[end]);
			return;
		}

		print(arr, start, end - 1);
		System.out.println(arr[end]);
		return;
	}
}
