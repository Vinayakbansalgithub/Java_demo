package Questions;

import java.util.Scanner;

public class LastOccurenceOfElement {
	private static int getIndex(int[] arr, int start, int end, int element) {

		if (start == arr.length) {
			return -1;
		}

		int index = getIndex(arr, start + 1, end, element);

		if (index == -1) {

			if (arr[start] == element) {
				return start;
			} else {
				return -1;
			}

		}

		return index;

	}

	private static int getIndexfirst(int[] arr, int start, int end, int element) {

		if (start == arr.length) {
			return -1;
		}

		if (arr[start] == element) {
			return start;
		}

		int index = getIndexfirst(arr, start + 1, end, element);

		return index;

	}

	private static int[] getIndexAll(int[] arr, int start, int end, int element, int count) {

		
		
		if(start== arr.length) {
			int[] arrtemp= new int[count];
			return arrtemp;
		}
		
		int index[];
		if(arr[start]==element) {
			
			index=getIndexAll(arr,start+1,end,element,count+1);
			
		}else {
			index=getIndexAll(arr,start+1,end,element,count);
		}
		
		if(arr[start]==element) {
			
			index[count]=start;
			count--;
		}

		
		return index;
	}
	
	
	public static void main(String[] args) throws Exception {

//		Scanner scanner = new Scanner(System.in);
//		int totalElements = Integer.parseInt(scanner.nextLine().trim());
		// String arrayString = scanner.nextLine();

		int arr[] = { 1, 2, 3, 4, 5, 1 };

		// int lastIndex = getIndex(arr, 0, arr.length -1,1);

		//int findIndex = getIndexfirst(arr, 0, arr.length - 1, 1);
		
		int[] arrall=getIndexAll(arr, 0, arr.length - 1, 1,0);

		System.out.println(arrall);

	}
}
