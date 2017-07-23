package Trees;

import java.util.Arrays;


// we are making it min heap
public class MaxHeapify {
	// 16 14 10 8 7 9 3 2 4 1

    public static int[] Arr = {1,3,6 ,14, 10 ,8,2,67 };
    public static int counter = 0;

    public static void main(String[] args) {
        int kk;
        for (kk = Arr.length -1; kk >= 0; kk--) {
            heapMin(Arr, kk);
    }

        System.out.println(Arrays.toString(Arr));



    }

    public static void heapMin(int[] Arr, int i) {

        int lowest = 0;
        int left = 2*i+1;
        int right = 2*i + 2;
        if (((left < Arr.length) && (Arr[left] < Arr[i]))) {
        	
        	// swap(i, left);
        	 lowest = left;
        	 
        } else {
        	lowest = i;
        }

        if (((right < Arr.length) && (Arr[lowest] > Arr[right]))) {
        	lowest = right;
        	//swap(i, right);        	
        }
        if (lowest != i) {
            swap(i, lowest);


            heapMin(Arr, lowest);
        }
    }

    private static void swap(int i, int lowest) {
        int t = Arr[i];
        Arr[i] = Arr[lowest];
        Arr[lowest] = t;

    }

}
