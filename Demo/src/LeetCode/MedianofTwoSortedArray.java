package LeetCode;

import org.bouncycastle.util.Arrays;

public class MedianofTwoSortedArray {
	static int x;
	static int median(int[] arr1, int[] arr2){
		
		int i= (arr1.length-1)/2;
		int j= (arr2.length-1)/2;
		
		
		if(i>=0 || j>=0){
		if(arr2[j]<=arr1[i] && arr1[i]<=arr2[j+1]){
			 x=arr1[i];
			return x;
		}
		else if(arr1[i]<=arr2[j] && arr2[i]<=arr2[j+1]){
			
			arr1=Arrays.copyOfRange(arr1, i, arr1.length);
			arr2=Arrays.copyOfRange(arr2, 0, j+1);
			
			if(arr2.length==1){
				int[] temp=arr1;
				arr1=arr2;
				arr2=temp;
				
			}
			median(arr1,arr2);
			

		}
		else if(arr1[i]>=arr2[j] && arr1[i]>=arr2[j+1]){
			
			arr1=Arrays.copyOfRange(arr1, 0, i+1);
			arr2=Arrays.copyOfRange(arr2, j, arr2.length);
			
			if(arr2.length==1){
				int[] temp=arr1;
				arr1=arr2;
				arr2=temp;
				
			}
			
			median(arr1,arr2);
			
		}
		}
		return x;
		
	}
	
public static void main(String[] args) {
	int arr1[]={12,16,18,20,22,100};
	int arr2[]={3,5,7,13,17,23};
	
	/*int arr1[]={7,9,28,35};
	int arr2[]={30,34,44,50};*/
	
int val=	median(arr1,arr2);
	System.out.println(val);
	
}

}
