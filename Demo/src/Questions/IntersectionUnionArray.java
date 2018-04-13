package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IntersectionUnionArray {
	
	
	static List<Integer> al= new ArrayList<Integer>();
	
	static int binarySearch(int[] arr, int value){
		
	int min=0;
	int max=arr.length-1;
	
	while(min<max){
		
		
		int middle=(min+max)/2;
		
		if(arr[middle]==value) return 0;
		
		if(arr[middle]>value){
			
			max=middle-1;
		}else
			min=middle+1;
		
		
		
	}
	return -1;
	
		
		
		
	}
	
	
	 static void intersection(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		 List<Integer> list ;
		 
		 
		if(arr1.length>arr2.length){
			Arrays.sort(arr2);
			
	       //  al = Arrays.asList(arr2);

			/*Collections.addAll(list, arr1);
			System.out.println(list.get(0));*/
		}
		else
			Arrays.sort(arr1);
		
		
		
		for (int i = 0; i < arr1.length; i++) {
			
			int check=binarySearch(arr2,arr1[i]);
			if(check==-1)
				al.add(i);
			
			
		}
		
		
		
		

		 
		 
		 
		 
		 
	}
	
public static void main(String[] args) {
	
	
	int arr1[] = {7, 1, 5, 2, 3, 6};
	int arr2[] = {3, 8, 6, 20, 7};
	
	
	
	intersection(arr1,arr2);
	
	
	
	
	Iterator itr=al.iterator();
	
    
	while(itr.hasNext())
		System.out.println(itr.next());
		
}


}
 