package BinarySearch;

public class FirstAndLastOccurenceInSorted {

	static int bs(int arr[], int start, int end, int element) {

		if (start <= end) {
			int mid = start + (end - start) / 2;
			int index = -1;

			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] > element) {
				end = mid - 1;
				index = bs(arr, start, end, element);

			} else {
				start = mid + 1;
				index = bs(arr, start, end, element);
			}

			return index;
		}
		return -1;

	}

	static int firstOccurence(int arr[], int start, int end, int element) {

		if (start <= end) {
			int mid = start + (end - start) / 2;
			int index = -1;

			if (arr[mid] == element) {
				index = mid;
				end = mid - 1;
				index = bs(arr, start, end, element);
			} else if (arr[mid] > element) {
				end = mid - 1;
				index = bs(arr, start, end, element);
			} else {
				start = mid + 1;
				index = bs(arr, start, end, element);
			}

			return index;
		}
		return -1;

	}

	static int LastOccurence(int arr[], int start, int end, int element) {

		if (start <= end) {
			int mid = start + (end - start) / 2;
			int index = -1;

			if (arr[mid] == element) {
				index = mid;
				start = mid + 1;
				index = bs(arr, start, end, element);

			} else if (arr[mid] > element) {
				end = mid - 1;
				index = bs(arr, start, end, element);

			} else {
				start = mid + 1;
				index = bs(arr, start, end, element);
			}

			return index;
		}
		return -1;

	}

	static int indexOfMin(int arr[], int start, int end) {

		if (start <= end) {
			int mid = start + (end - start) / 2;
			int index = 0;

			// base
			if (start == end)
				return end;

			if (start < mid && mid < end && arr[mid] <= arr[mid - 1] && arr[mid] > arr[mid + 1]) {  // 10 10 9
				return mid + 1;
			} else if (start < mid && mid < end && arr[mid] > arr[mid - 1] && arr[mid] >= arr[mid + 1]) {  // 9 10 10
				return mid - 1;
			} else if (start < mid && mid < end && arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {  // 9 8 10
				return mid;
			} else if (arr[mid] < arr[end]) {
				end = mid - 1;
				index = indexOfMin(arr, start, end);
			} else {
				start = mid + 1;
				index = indexOfMin(arr, start, end);

			}

			return index;
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 1 };
//		int res = bs(arr, 0, arr.length - 1, 10);
//		System.out.println(res);

//		int firstRes = firstOccurence(arr, 0, arr.length - 1, 10);
//		System.out.println("firstRes " + firstRes);
//
//		int lastRes = LastOccurence(arr, 0, arr.length - 1, 18);
//		System.out.println("lastRes " + lastRes);
//
//		System.out.println("count " + (lastRes - firstRes));

		// index of smallest element return the number of rotations
		// int[] arrNew = { 10, 10, 2, 3, 3, 4, 10 };
		// int[] arrNew = { 10, 11,12 };

		int indexOfMin = indexOfMin(arr, 0, arr.length - 1);
		System.out.println("noOfTimes " + indexOfMin);

		System.out.println("min is ---- " + arr[indexOfMin]);

		// search in a rotated sorted array
		int value = 1;
		int res1 = bs(arr, 0, indexOfMin - 1, value);
		int res2 = bs(arr, indexOfMin, arr.length - 1, value);

		System.out.println(" index  for element " + value + " is  " + Math.max(res1, res2));

	}
}
