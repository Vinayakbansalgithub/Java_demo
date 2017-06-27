package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;



public class HashSetDemo {
public static void main(String[] args) {
	
	
	int array[]={1,2,3,4,5};
	int rotration=4;
	
	
	
	for (int i = 0; i < rotration; i++) {
		int val=array[0];
		for (int j = 0; j < array.length-1; j++) {
			
		
			array[j]=array[j+1];
			
			
			
		}
		array[ array.length-1]=val;
		
		
	}
	
	
	System.out.println(Arrays.toString(array));
	
	
	
	
	
	
	
	
	SortedSet<String> arr= new TreeSet<String>();
	arr.add("vinayak");
	arr.add("shobhit");
	//arr.add("vinayak");
	arr.add("kanchan");
	
	arr.add("abhinav");
	arr.add("raju");
	//arr.add("vinayak");
	arr.add("zehan");

	Collections.synchronizedSet(arr);
	Set<String> set= new HashSet<String>(arr);
	System.out.println(set);
	
	Set<String> subSet =	arr.subSet("abhinav", "raju");
	System.out.println(subSet);
}
}
