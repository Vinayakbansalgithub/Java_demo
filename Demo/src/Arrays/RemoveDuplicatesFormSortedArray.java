package Arrays;


//leet 26

// for unsorted array we can use hashmap
public class RemoveDuplicatesFormSortedArray {
	// Function to remove duplicate elements
	// This function returns new size of modified
	// array.
	static int removeDuplicates(int arr[], int n) {
		if (n == 0 || n == 1)
			return n;

		// To store index of next unique element
		int j = 0;

		// Doing same as done in Method 1
		// Just maintaining another updated index i.e. j
		for (int i = 0; i < n - 1; i++) {

			System.out.println("considering " + arr[i] + "  and " + arr[i + 1]);
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}

		arr[j] = arr[n - 1];
		j++;
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int n = arr.length;

		n = removeDuplicates(arr, n);

		// Print updated array
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
