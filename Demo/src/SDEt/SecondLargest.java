package SDEt;

public class SecondLargest {
	
	static int secondlargest=Integer.MIN_VALUE;
	static int largest=Integer.MIN_VALUE;
	static int secondLargestcvalue(int[] arr) {
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>largest){
				
				secondlargest=largest;
				largest=arr[i];
				
				
			}
			
	
			if(largest!=arr[i] &&  largest>arr[i] &&  arr[i]>secondlargest){
				secondlargest=arr[i];
				
				
			}
			
			
		}
		
		
		
		
		
		
		System.out.println(secondlargest);
		
		
		
return 0;		
	}
public static void main(String[] args) {
	int arr[]={1,3,4,2,77,9,31,66,101,101};
	
	secondLargestcvalue(arr);
	
	
}

 
}
