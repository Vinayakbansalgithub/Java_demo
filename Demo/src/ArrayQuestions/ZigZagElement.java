package ArrayQuestions;

import java.util.Arrays;

public class ZigZagElement {

	static void find(int[] arr) {

		int i = 0;
		boolean flag = true;
		while (i < arr.length - 1) {

			if (flag) {
				if (arr[i] > arr[i + 1]) {

					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}

			}

			if (!flag) {

				if (arr[i] < arr[i + 1]) {

					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}

			}

			flag = !flag;
			i++;

		}

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 11, 1, 3, 111, 80, 100 };

		find(arr);

		System.out.println(Arrays.toString(arr));
	}

}
