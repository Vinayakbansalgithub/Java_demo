package Extra;

import java.util.Arrays;

public class LastIndexofOne {
	static void find(int[] arr) {
		int i = 0;
		int lastIndex = -1;
		while (i < arr.length - 1) {

			if (arr[i] == 1)
				lastIndex = i;

			i++;

		}
		System.out.println(lastIndex);

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 0, 1, 0, 1, 1, 0, 0, 0, 0, 0 };
		find(arr);
		System.out.println(Arrays.toString(arr));
	}
}
