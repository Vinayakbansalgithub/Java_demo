package Trees;

import java.util.Arrays;

// in max heap smallest element is on the top
public class MaxHeapify {
	// 16 14 10 8 7 9 3 2 4 1

	public static int[] Arr = { 1, 3, 6, 14, 10, 2 };
	public static int counter = 0;
	
	static int[] sortedarray;

	public static void main(String[] args) {
		
		sortedarray = new int[Arr.length];
		
		for (int i = Arr.length - 1; i >= 0; i--) {
		
		for (int kk = i; kk >= 0; kk--) {
			heapMax(Arr, kk);
		}

		sortedarray[i] = Arr[0];
	
		Arr[0] = Arr[Arr.length - 1];
		Arr = Arrays.copyOf(Arr, Arr.length - 1);

	}

	System.out.println(Arrays.toString(sortedarray));

	}

	public static void heapMax(int[] Arr, int index) {

		int highest = Arr[index];
		int highestIndex = index;
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		if (left < Arr.length && Arr[left] > highest) {
			highestIndex = left;
			highest = Arr[left];
		} 
		if (right < Arr.length && Arr[right] > highest) {
			highestIndex = right;
			highest = Arr[right];
		}
		if (Arr[index] != highest) {
			int temp = Arr[index];
			Arr[index] = Arr[highestIndex];
			Arr[highestIndex] = temp;

			heapMax(Arr, highestIndex);
		}
	}

	
}
