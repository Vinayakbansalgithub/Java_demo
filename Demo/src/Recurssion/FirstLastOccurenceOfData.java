package Recurssion;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstLastOccurenceOfData {

	static int findFirst(int[] arr, int index, int data) {
		int arrIndex = -1;

		if (index == arr.length - 1) {
			return arrIndex;
		}

		if (arr[index] == data) {
			return index;
		} else {
			arrIndex = findFirst(arr, index + 1, data);
			return arrIndex;
		}

	}

	static int findLast(int[] arr, int index, int data) {
		int arrIndex = -1;

		//System.out.println("current index is " + index);

		if (arr[index] == data) {
			arrIndex = index;
		}

		while (index < arr.length - 1) {
			int returnValue = findLast(arr, index + 1, data);
			
			// if value is not -1 means we have the max index with us
			// Method 1
//			if(returnValue!=-1) {
//				return returnValue;
//			}else {
//				return arrIndex;
//
//			}

			
			
			if (returnValue < arrIndex) {
				return arrIndex;
			} else {
				return returnValue;
			}
		}

		return arrIndex;

	}

	static int count=0;
	
	

static int[] allIndex(int[] arr, int index, int data, int count) {
	int [] arrind;
	if (index == arr.length) {
		
		int[] baseArr= new int[count];
		return baseArr;
	}
if(arr[index]==data) {
		arrind= allIndex(arr, index + 1, data, count+1);
	}else {
		arrind = allIndex(arr, index + 1, data, count);

	}
	if(arr[index]==data) {
		arrind[count]=index;
	}

	return arrind;

}
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		int arrUnsorted[] = { 1, 2, 13, 14, 14, 15 };
		int arr[] = { 3, 8, 1, 8, 8, 15 };

		// System.out.println(findFirst(arrUnsorted, 0, 14));
		//System.out.println(findLast(arr, 0, 8));
		System.out.println(Arrays.toString(allIndex(arr, 0, 8, 0)));
	}
}
