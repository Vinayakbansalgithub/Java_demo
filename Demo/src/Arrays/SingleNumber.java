package Arrays;

import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {
	public static void main(String[] args) {

	int arr[] = new int[] { 1,  2, 5, 2 ,1,6,7,7};
	find(arr);
	}

	 static void find(int[] arr) {
		// TODO Auto-generated method stub
		 
		 HashSet<Integer> set= new HashSet<Integer>();
		 
		 
		 
		 
		 for (int i = 0; i < arr.length; i++) {
			
			 
			 if(set.contains(arr[i])) {
				 set.remove(arr[i]);
			 }else
				 set.add(arr[i]);
		}
		 
		 
		Iterator<Integer>itr=set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
	
}
