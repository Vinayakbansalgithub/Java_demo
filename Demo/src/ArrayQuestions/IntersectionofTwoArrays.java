package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


// common in both the arrays
public class IntersectionofTwoArrays {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String Arr1 = scan.nextLine();
		String Arr2 = scan.nextLine();
		String strarr1[] = Arr1.split(" ");
		String strarr2[] = Arr2.split(" ");
		int[] arr1 = new int[strarr1.length];
		int[] arr2 = new int[strarr2.length];

		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = Integer.parseInt(strarr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {

			arr2[i] = Integer.parseInt(strarr2[i]);
		}

		int[] res = find(arr1, arr2);
		System.out.println(Arrays.toString(res));
	}

	static int[] find(int[] arr1, int[] arr2) {

		List<Integer> list = new ArrayList<>();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i = 0;
		int j = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {

				i++;
			} else if (arr1[i] > arr2[j]) {

				j++;
			} else {

				list.add(arr1[i]);
				i++;
				j++;

			}

		}

		int[] res = list.stream().mapToInt(k -> k).toArray();

		return res;
	}
}
