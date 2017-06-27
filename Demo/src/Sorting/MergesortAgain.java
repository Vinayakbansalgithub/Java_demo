package Sorting;

public class MergesortAgain {
	
int arr[];
int length,higherIndex,lowerIndex,middleIndex;
int L[], R[];

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		this.arr=arr;
		length=arr.length;
		higherIndex=length-1;
		divide(lowerIndex,higherIndex);
		
	}
	
	private void divide(int lowerIndex, int higherIndex) {
		// TODO Auto-generated method stub
		if(lowerIndex< higherIndex){
			int middleIndex= (higherIndex+lowerIndex)/2;
		divide(lowerIndex,middleIndex);
		divide(middleIndex+1, higherIndex);
		merge(lowerIndex,middleIndex,higherIndex);

	}
		
		
		
		
	}

	private void merge(int lowerIndex, int middleIndex, int higherIndex) {
		
		int n1 = middleIndex - lowerIndex + 1;
		int n2 = higherIndex - middleIndex;
		L = new int[n1];
		R = new int[n2];
		// TODO Auto-generated method stub
		
		
		
		for (int i = 0; i < n1; i++) {
			L[i]=arr[i+lowerIndex];
		}
		for (int j = 0; j < n2; j++) {
			R[j]=arr[j+middleIndex+1];
		}
		int i = 0, j = 0; 
		int index=lowerIndex;
		while(i<n1 && j<n2){
		if(L[i]>R[j]){
			arr[index]=R[j];	
			j++;
			index++;
			
		}
		else if(L[i]<R[j]){
			arr[index]=L[i];	
			i++;
			index++;
		}
		}
		
		
		while (i < n1) {
			arr[index] = L[i];
			i++;
			index++;
		}

		/* Copy remaining elements of L[] if any */
		while (j < n2) {
			arr[index] = R[j];
			j++;
			index++;
		}
	}

	public static void main(String[] args) {

	int arr[]={38,27,43,3,9,82,10};
	
	MergesortAgain obj= new MergesortAgain();
	obj.sort(arr);

	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}

}
