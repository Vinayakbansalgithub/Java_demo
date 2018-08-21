package Trees;

import java.util.Arrays;

public class MinHeap {
public static void main(String[] args) {
	int arr[]={11,3,0,2,1,11,5,9,0,6,5,9,8};
	
	Max_heapfy(arr);
	
}




static int length;
static int sortedlength;

static int[] sortedarray;

 public static void Max_heapfy(int[] arr) {
	 sortedarray= new int[arr.length];
	
		
	 for (int i = arr.length-1; i >= 0; i--) {
	for (int j = i; j >= 0; j--) {
		
		heapfy(arr,j);
		
			
		
	
	 }
	
	 sortedarray[i]=arr[0];
	 
	 arr[0]=arr[arr.length-1];
	 arr= Arrays.copyOf(arr, arr.length-1);
	 
	 
	 }
	 
	 System.out.println(Arrays.toString(sortedarray));

}
 static void heapfy(int[] arr,int index){
	 
	 int left=index*2+1;
	 int right=index*2+2;
	 int highest=arr[index];
	 int highestindex=index;
	 
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
		 heapfy( arr, highestindex);
		 
	 }
	 
	 
	 
	 
	 
	 
 }
}
