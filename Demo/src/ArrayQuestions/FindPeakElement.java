package ArrayQuestions;

public class FindPeakElement {
public static void main(String[] args) {
	int arr[]= {1,1,4};
	
	int index=find(arr);
	System.out.println(arr[index]);
}

private static int find(int[] arr) {
	// TODO Auto-generated method stub
	
	for (int i = 0; i < arr.length; i++) {
		
		if(i==0 && arr[i]>arr[i+1])
			return i;
		
		if(i==arr.length-1 && arr[i]>arr[i-1])
			return arr.length-1;
		
		
		if(arr[i]>arr[i+1] && arr[i]>arr[i-1] )
			return i;
		
		
		
	}
	
	return -1;
	
}
}