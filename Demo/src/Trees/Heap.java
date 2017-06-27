package Trees;

public class Heap {
public static void main(String[] args) {
	int arr[]={1,3,6,5,9,8};
	
	max_Heapfy(arr,1);
	
}

 static void max_Heapfy(int[] arr, int i) {
	// TODO Auto-generated method stub
	
	 int left=(2*i);
	 int right=2*i+1;
	 int length=arr.length;
	 int largest;
	 if(left<=length && arr[left-1]>arr[i-1]){
		 largest=left;
	 }
	 else{
		 largest=i;
	 }	 
	 if(right<=length && arr[right-1]>arr[largest-1]){
		 largest=right;
	 }
	  if(i!=largest){
	 int temp=arr[largest-1];
	 arr[largest-1]=arr[i-1];
	 arr[i-1]=temp;
	  }
	 max_Heapfy(arr,largest);
	 
	 
}
}
