package Graph;

import java.util.Arrays;

public class HeapForPrims {

static int length;
static int sortedlength;
static int element;
 public static int Max_heapfy(int[] arr, int i) {
	// TODO Auto-generated method stub
	
	 int sortedarray[]= new int[6];

	

length=arr.length;

for(int ii=length-1;ii>=0;ii--){
	
	heapfy(arr,ii);
}

System.out.println(Arrays.toString(arr));



element=arr[arr.length-1];
System.out.println(element);

arr =Arrays.copyOf(arr, length-1);




return element;
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
