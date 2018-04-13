package Trees;

import java.util.Arrays;

public class MinHeap {
public static void main(String[] args) {
	int arr[]={1,3,6,5,9,8};
	
	Max_heapfy(arr,1);
	
}




static int length;
static int sortedlength;

static int[] sortedarray= new int[10];

 public static void Max_heapfy(int[] arr, int i) {
	 
	
		
	 for (int j11 = arr.length-1; j11 >= 0; j11--) {
	for (int j1 = j11; j1 >= 0; j1--) {
		
		heapfy(arr,j1);
		
			
		
	
	 }
	
	 sortedarray[j11]=arr[0];
	 
	 arr[0]=arr[arr.length-1];
	 arr= Arrays.copyOf(arr, arr.length-1);
	 
	 
	 
	 }
	 
	
}
 static void heapfy(int[] arr,int index){
	 
	 int left=index*2+1;
	 int right=index*2+2;
	 int highest=arr[index];
	 int highestindex=0;
	 
	 if(left<arr.length&&arr[left]>highest){
		 highest=arr[left];
		 highestindex=left; 
	 }
	 
	 
	 if(right<arr.length&&arr[right]>highest){
		 highest=arr[right];
		 highestindex=right; 
 
	 }
	 
	 

	 if(arr[index]!=highest){
		 
		 int temp=arr[index];
		 arr[index]=arr[highestindex];
		 arr[highestindex]=temp;
		 
		 
		 // to make all left element smalll
		 //heapfy( arr, highestindex);
		 
	 }
	 
	 
	 
	 
	 
	 
 }
}
