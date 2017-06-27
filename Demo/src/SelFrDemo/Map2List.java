package SelFrDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Map2List {
	public static void main(String[] args) {
	     // Create a HashSet
	//     HashSet<String> hset = new HashSet<String>();
		HashMap<String, String> hm= new HashMap<String, String>();
		hm.put("vinayak", "Bansal");
		hm.put("nitin", "kumar");
		hm.put("sunny", "nasa");
		
	 System.out.println("---  using map ---");
	    
	     // Displaying HashSet elements
	     System.out.println("hashmap values using entryset contains: "+ hm.entrySet());
	  System.out.println("---  using set ---");
	    
	    Set<Entry<String, String>> set= hm.entrySet();
	     
	     System.out.println("HashSet contains: "+ set);
	    
	     List<Entry<String, String>> list = new ArrayList<Entry<String,String>>(set);
	 System.out.println("---  using list  ---");
	     // Displaying ArrayList elements
	     System.out.println("ArrayList contains: "+ list);
	  }
}
