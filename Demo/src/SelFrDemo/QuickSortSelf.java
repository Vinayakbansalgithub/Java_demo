package SelFrDemo;



public class QuickSortSelf {
	 void sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		 if(low<high){
		 int pi= partition(arr,low,high);
		 
				 sort(arr,low,pi-1);
				 sort(arr,pi+1,high);
		 }
		 
	}
	
 int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
	 int i=low-1;
	 int pivot= arr[high];
	 
	for(int j=low;j<=high-1;j++){
		if(arr[j]<pivot){
		i++;
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
			}
	}
	int temp;
	temp=arr[i+1];
	arr[i+1]=pivot;
	arr[high]=temp;
			
			
	
	
		return i+1;
	}

public static void main(String[] args) {
	 int arr[] = {10, 7, 8, 5,85,33,21,9};
     int n = arr.length;
     QuickSortSelf obj= new QuickSortSelf();
     obj.sort(arr,0,n-1);
     
     for(int i=0;i<=arr.length-1;i++)
	 {
		 System.out.println("value of array are  "+arr[i]);
	 }	 
}



}
