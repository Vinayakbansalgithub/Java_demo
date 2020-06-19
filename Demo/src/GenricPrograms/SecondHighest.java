package GenricPrograms;

public class SecondHighest {
public static void main(String[] args) {
	int arr[]= {985, 521, 975, 831, 479, 861};
	int smallest=arr[0];
	int secondhioghest = arr[0];
	
	for (int i = 1; i < arr.length; i++) {
		
		if(arr[i]<smallest)
		smallest=arr[i];
		
	}
	System.out.println(smallest);
	
	
	for (int i = 1; i < arr.length; i++) {
		if(arr[i]>smallest&&arr[i]<secondhioghest)
			secondhioghest=arr[i];
		
		
	} 
	
	System.out.println(secondhioghest);
	
	
	
}

}
