package Trees;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestusingHeap {
public static void main(String[] args) {
	
	
/*	Scanner scan= new Scanner(System.in);
int val=scan.nextInt();
	System.out.println(val);
	Integer in=val;
	
	String str= new String(in.toString());
	System.out.println(str.length());*/
	
	
	
	
int arr[]={1,3,6,5,2,4};
	// max heap means bigest number on the top
	Max_heap(arr,1);
}

 static void Max_heap(int[] arr, int i) {
	// TODO Auto-generated method stub
	 int sortedarray[]= new int[6];
	 int k=0;
	for (int ii = arr.length-1; ii >=0; ii--) {
		
		
		for (int j = arr.length-1; j >=0 ; j--) {
			makeheap(arr,j);		
		}
	//	System.out.println(Arrays.toString(arr));
		sortedarray[k++]=arr[0];
		int temp=arr[arr.length-1];
		arr[arr.length-1]=arr[0];
		arr[0]=temp;
		
		arr=Arrays.copyOf(arr, arr.length-1);
		
		//System.out.println(Arrays.toString(arr));
		
		
	}
	
	System.out.println(Arrays.toString(sortedarray));
	
	//System.out.println("nth largest number is "+arr[0]);
	
}

 static void makeheap(int[] arr, int j) {
	// TODO Auto-generated method stub
	 
	 int largest;
	 int left=j*2+1;
	 int right=j*2+2;
	 
	 
	 if(left<arr.length && arr[left]>arr[j]){
		 largest=left;
		 
	 }
	 else{
		 largest=j;
	 }
	 
	 if(right<arr.length && arr[right]>arr[largest]){
		 largest=right;
		 
	 }
	 
	 if(j!=largest){
		 int temp=arr[j];
		 
		 arr[j]=arr[largest];
		 arr[largest]=temp;
		 
	 }
	 
	 
	 
	 
	
}
}
