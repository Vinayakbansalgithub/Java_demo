package Questions;

import java.util.Scanner;

public class LastOccurenceOfElement {
	private static int getIndex(int[] arr, int start, int end, int index, int elements) {

		if (start > end) {
			return index;
		}

		if (arr[start] == elements) {
			index = start;
		}
		index = getIndex(arr, start + 1, end, index, elements);

		return index;
	}
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		int totalElements = Integer.parseInt(scanner.nextLine().trim());
		String arrayString = scanner.nextLine();
		String arrayStringarr[] = arrayString.split(" ");
		int arr[] = new int[arrayStringarr.length];
		int index = 0;
		for (String i : arrayStringarr) {
			arr[index] = Integer.parseInt(i.trim());
			index++;
		}
		int elements = Integer.parseInt(scanner.nextLine());

		int  findIndex = getIndex(arr, 0, arr.length - 1,-1,elements);

		System.out.println(findIndex);

	}
}
