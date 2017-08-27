package SDEt;

public class SecondLargest {
	
	static int secondlargest=0;
	static int largest=0;
	static int secondLargestcvalue(int[] arr) {
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>largest){
				
				secondlargest=largest;
				largest=arr[i];
				
				
			}
			
		
			if(largest!=arr[i] &&  largest>arr[i]){
				secondlargest=arr[i];
				
				
			}
			
			
		}
		
		
		
		
		
		
		System.out.println(secondlargest);
		
		
		
return 0;		
	}
public static void main(String[] args) {
	int arr[]={1,3,4,2,77,9,31,66,99,100};
	
	secondLargestcvalue(arr);
	
	
}

 
}
