package Extra;

import java.util.Arrays;

public class ReverseArrayinGroups {

	static void reverse(int arr[], int k) {

		for (int i = 0; i < arr.length;) {

			if (arr.length - i < k)
				break;

			int min_index = i;
			int max_index = i + k - 1;
			while (min_index < max_index) {
				int temp = arr[min_index];
				arr[min_index] = arr[max_index];
				arr[max_index] = temp;
				min_index++;
				max_index--;
			}

			i = i + k;

		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 1; i < 10; i++) {
			reverse(arr, i);
			System.out.println(Arrays.toString(arr));
			arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		}

	}

}
