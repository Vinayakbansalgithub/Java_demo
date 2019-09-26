package Questions;

import java.util.Arrays;

public class StockSpanProblem {
	
	private static int[] solve(int[] arr) {
		
		int[] newArr= new int[arr.length];

		int sum=1;
		int highsetTillNowIndex=0;
		int highestNumber=arr[0];
		newArr[0]=1;
		for (int i = 1; i < arr.length; i++) {
			
		if(arr[i]<arr[i-1]) {
			
			newArr[i]=1;
			
			System.out.println(highestNumber<arr[i]);
			
			if(highestNumber<arr[i]) {
				highestNumber=arr[i];
				highsetTillNowIndex=i;
			}
			
			
		}else {
			
			if(arr[i]>highestNumber) {
				newArr[i]=i+1;
				highestNumber=arr[i];
				highsetTillNowIndex=i;

				
			}else {
				int mysum=0;
				
				
				newArr[i]=i-highsetTillNowIndex;
				
			}
			
		}
		
		
			
			
			
		}
		
		
		
		
		
		
		return newArr;
	}
	
	
public static void main(String[] args) {
	
	
	int arr[]= {15,13,12,14,16,8,6,4,10,30,90,1,12};
	
	
	int[] solution=solve(arr);
	
			for (int i = 0; i < solution.length; i++) {
				System.out.print(solution[i]+"  ");
			}
			
}


}
