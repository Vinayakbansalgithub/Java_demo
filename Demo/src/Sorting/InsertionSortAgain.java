package Sorting;

public class InsertionSortAgain {
	private void sort(int[] arr, int i) {
		
		 int temp;

		// TODO Auto-generated method stub
		for (int j = 1; j < arr.length; j++) {
			
			int counter=j;
			
			while (counter>0 && arr[counter]<arr[counter-1]   ) {

				temp=arr[counter-1];
				arr[counter-1]=arr[counter];
				arr[counter]=temp;
				counter--;
			}
		}
	}
	
	
	public static void main(String[] args) {
		

	int arr[] = {23, 42, 4, 16, 8, 15};
	int len=arr.length;
			
	InsertionSortAgain obj = new InsertionSortAgain();
	obj.sort(arr,len-1);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}

	
}
