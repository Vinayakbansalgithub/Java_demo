package ArrayQuestions;

import java.util.Arrays;


//  main program
import java.util.Iterator;

public class AllCombinationofArray_LargestNumeberOfArray {

	static int max = 0;

	

	public static void main(String[] args) {
		int arr[] = { 9, 34, 33, 2, 8 };
		int n = arr.length;
		AllCombinationofArray_LargestNumeberOfArray permutation = new AllCombinationofArray_LargestNumeberOfArray();
		permutation.permute(arr, 0, n - 1);
		System.out.println("number is " + Arrays.toString(arr));
	}


	private void permute(int arr[], int start, int end) {
				
		for (int i = start; i < end; i++) {
			int left = i;
			for (int ii = i + 1; ii <= end; ii++) {
				String one = arr[left] + "" + arr[ii];
				String two = arr[ii] + "" + arr[left];
				if (Integer.parseInt(one) < Integer.parseInt(two)) {
					swap(arr, left, ii);
				}
			}
			System.out.println(Arrays.toString(arr));

		}
		
		
	}

	
//	private void permute(int arr[], int start, int end) {
//	
//	 // input primitive integer array
//    int[] intArray = { 1, 2, 3, 4 ,5 };
//
//    String[] strArray = new String[intArray.length];
//
//    for (int i = 0; i < intArray.length; i++) {
//        strArray[i] = String.valueOf(intArray[i]);
//    }
//    
//    StringBuilder stringBuilder = new StringBuilder();
//
//    Arrays.sort(strArray, (String a, String b) -> {
//        String ab=a+b;
//        String ba=b+a;
//        return ab.compareTo(ba) > 0 ? -1 :1;
//    });
//
//    for(int i=0;i<arr.length;i++){
//        stringBuilder.append(arr[i]);
//    }
//   
//    System.out.println(stringBuilder);
//    
//    
//    
//	}

	public int[] swap(int arr[], int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

}
