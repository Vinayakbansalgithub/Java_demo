package Trees;

import java.util.Arrays;

public class MinHeap {
public static void main(String[] args) {
	int arr[]={1,3,6,5,9,8};
	
	Max_heapfy(arr,1);
	
}




static int length;
static int sortedlength;
 static void Max_heapfy(int[] arr, int i) {
	// TODO Auto-generated method stub
	
	 int sortedarray[]= new int[6];
for (int j = arr.length-1; j>=0  ; j--) {
	

length=arr.length;

for(int ii=length-1;ii>=0;ii--){
	
	heapfy(arr,ii);
}

System.out.println(Arrays.toString(arr));



sortedarray[j]=arr[0];

int temp=arr[0];
arr[0]=arr[length-1];
arr[length-1]=temp;

arr =Arrays.copyOf(arr, length-1);

}

System.out.println(Arrays.toString(sortedarray));



 }
 static void heapfy(int[] arr, int ii) {
	 int largest;
	 int left=2*ii+1;
	 int right=2*ii+2;
	 
	 
	 
	 
	// TODO Auto-generated method stub
	 if(left<length && arr[left]>arr[ii]){
			largest=left;
		}
	 else{
		 largest=ii;
		 
	 }
	 
		if(right<length && arr[right]>arr[largest]){
			
			largest=right;		}
		
		if(ii!=largest){
			
			int temp=arr[largest];
			arr[largest]=arr[ii];
			arr[ii]=temp;
			
			
			// we recall heapfy to balance again according to max heap means all the parents greater then child.
		heapfy(arr,largest);
		

		 }
}

}
