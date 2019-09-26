package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnIndexOfElement {

	static int[] getIndexarr(int[] arr, int start, int elements) {

		
		if (arr.length == 1 && arr[start] == elements) {
			int arrt[] = new int[1]; // empty array
			arrt[0] = 0;
			return arrt;
		}
		
		if (arr.length == start) {
			return new int[0]; // empty array
		}
		

	
		int[] rr = getIndexarr(arr, start + 1, elements);

		if (arr[start] == elements) {
			int[] finalArr = new int[rr.length + 1];
			finalArr[0] = start;
			int k = 1;

			for (int i = 0; i < rr.length; i++) {
				finalArr[k] = rr[i];
				k++;
			}

			return finalArr;

		} else {
			return rr;
		}
		

	}

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int totalElements = Integer.parseInt(scanner.nextLine().trim());
		int arr[] = new int[totalElements];
		for (int i = 0; i < totalElements; i++) {
			String arrayString = scanner.nextLine();
			arr[i] = Integer.parseInt(arrayString.trim());
		}
		int elements = Integer.parseInt(scanner.nextLine());
		int[] findIndex = getIndexarr(arr, 0, elements);
		for (int i = 0; i < findIndex.length; i++) {
			System.out.print(findIndex[i]+" ");
		} 

	}

}
