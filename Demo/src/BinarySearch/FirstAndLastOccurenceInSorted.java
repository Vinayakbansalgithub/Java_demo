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

	static int NumberOfTimesRotatedeSortedArray(int arr[], int start, int end) {

		if (start <= end) {
			int mid = start + (end - start) / 2;
			int index = -1;

			if (arr[mid] < arr[mid - 1] && arr[mid] <= arr[mid + 1]) {
				return mid;
			} else if (arr[start] < arr[mid]) {
				start = mid + 1;
				if (start == arr.length)
					start = 0;
				index = NumberOfTimesRotatedeSortedArray(arr, start, end);
			} else if (arr[mid] < arr[end]) {
				end = mid - 1;
				if (end == -1)
					end = arr.length - 1;
				index = NumberOfTimesRotatedeSortedArray(arr, start, end);
			}

			return index;
		}
		return -1;

	}

	static int searchElementInRotatedeSortedArray(int arr[], int start, int end) {

		if (start <= end) {
			int mid = start + (end - start) / 2;
			int index = -1;

			if (arr[mid] < arr[mid - 1] && arr[mid] <= arr[mid + 1]) {
				return mid;
			} else if (arr[start] < arr[mid]) {
				start = mid + 1;
				if (start == arr.length)
					start = 0;
				index = NumberOfTimesRotatedeSortedArray(arr, start, end);
			} else if (arr[mid] < arr[end]) {
				end = mid - 1;
				if (end == -1)
					end = arr.length - 1;
				index = NumberOfTimesRotatedeSortedArray(arr, start, end);
			}

			return index;
		}
		return -1;

	}



	public static void main(String[] args) {
		int[] arr = { 2, 4, 10, 10, 10, 18, 20 };
		int res = bs(arr, 0, arr.length - 1, 180);
		System.out.println(res);

		int firstRes = firstOccurence(arr, 0, arr.length - 1, 10);
		System.out.println(res);

		int lastRes = LastOccurence(arr, 0, arr.length - 1, 18);
		System.out.println(res);

		System.out.println("count " + (lastRes - firstRes));

		// index of smallest element return the number of rotations
		int[] arrNew = { 10, 10, 18, 2, 2, 4, 10 };
		res = NumberOfTimesRotatedeSortedArray(arrNew, 0, arrNew.length - 1);
		System.out.println("rotations " + res);

		// we know the index of smallest element, by that array left to it is sorted and
		// array right to it is sorted, apply bs
		int res1 = bs(arrNew, 0, res - 1, 4);
		int res2 = bs(arrNew, res, arrNew.length - 1, 4);

		System.out.println("element index  " + Math.max(res1, res2));

		//   floor ceil pending 
		

	}
}
