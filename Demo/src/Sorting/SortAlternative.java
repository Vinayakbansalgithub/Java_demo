package Sorting;

import java.util.Arrays;

public class SortAlternative {
	int size;
	int[] arr;
	public int[] sort(int[] arr) {
		size = arr.length;
		this.arr = arr;
		int temp;
		
		int[] alter;
		boolean flag=true;
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[j-1] > arr[j]){
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				
			}}
		} 
		System.out.println(Arrays.toString(arr));
		
		alter=new int[size];
		
		
		int start=0;
		int end=size-1;
		
		 for (int i=0; i<size; i++)
		    {
		        if (flag)
		        	alter[i] = arr[end--];
		        else
		        	alter[i] = arr[start++];
		 
		        flag = !flag;
		    }
		
		 
		
		return alter;
		
	}
public static void main(String[] args) {
	int arr[] = { 5, 1, 12, -5, 16, 2, 13, 14, };
	SortAlternative obj = new SortAlternative();
	arr=obj.sort(arr);
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
