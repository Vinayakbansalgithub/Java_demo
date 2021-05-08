package Arrays;

public class SearchInsortedRotatedArray {
	// Returns index of key in arr[l..h]
	// if key is present, otherwise returns -1
	static int search(int arr[], int si, int ei, int key) {
		while (si <= ei) {

			int mid = (ei + si) / 2;

			if (arr[mid] == key)
				return mid;

			if (arr[si] < arr[mid]) {
				if (key <= arr[mid] && key >= arr[si])
					ei = mid - 1;
				else
					si = mid + 1;

			} else {

				if (key >= arr[mid] && key <= arr[ei])
					si = mid + 1;
				else
					ei = mid - 1;

			}
		}
		return -1;
	}

	// main function
	public static void main(String args[]) {
		int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
		int n = arr.length;
		int key = 2;
		int i = search(arr, 0, n - 1, key);
		if (i != -1)
			System.out.println("Index: " + i);
		else
			System.out.println("Key not found");
	}
}
