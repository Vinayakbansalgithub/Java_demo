package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


// covered in prev questions

// continious elements
public class SubarraywithZeroSumCount {

	static int findCount(int arr[]) {
		// Creates an empty hashset hs
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		// Initialize sum of elements
		int sum = 0;
		int fullCount = 0;
		
		
		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
		
			sum+=arr[i];
			
			
			if(map.containsKey(sum)) {
				int count= map.get(sum);
				fullCount+=count;
				map.put(sum, count+1);
				
			}else {
				map.put(sum, 1);
			}
		
	
		}
		return fullCount;	
	}

	public static void main(String arg[]) {
		int arr[] = {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
		

		int count=findCount(arr);
		System.out.println("ans "+count);
	}
}
