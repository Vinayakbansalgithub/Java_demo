package Recurssion;

import java.util.Arrays;



// main
public class DutchNationalFlagProblem {
	
	
	//  https://www.youtube.com/watch?v=oaVa-9wmpns&ab_channel=takeUforwardtakeUforward

    // Sort the input array, the array is assumed to 
    // have values in {0, 1, 2} 
	
	// time complexity is O(n)
	// also it is inplace algo
    static void sort012(int a[], int arr_size) 
    { 
        int lo = 0; 
        int hi = arr_size - 1; 
        int mid = 0, temp = 0; 
        while (mid <= hi) { 
            switch (a[mid]) { 
            case 0: { 
                temp = a[lo]; 
                a[lo] = a[mid]; 
                a[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: { 
                temp = a[mid]; 
                a[mid] = a[hi]; 
                a[hi] = temp; 
                hi--; 
                break; 
            } 
            } 
        } 
      
    } 
    public static void swap (int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
    /* Utility function to print array arr[] */
    static void printArray(int arr[], int arr_size) 
    { 
        int i; 
        for (i = 0; i < arr_size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    } 
  
    /*Driver function to check for above functions*/
    public static void main(String[] args) 
    { 
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2}; 
        int arr_size = arr.length; 
        sort012(arr, arr_size); 
        System.out.println("Array after seggregation "); 
        printArray(arr, arr_size); 
    } 
}
