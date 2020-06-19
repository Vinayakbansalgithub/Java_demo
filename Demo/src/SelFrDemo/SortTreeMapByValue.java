package SelFrDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortTreeMapByValue {
	public static void main(String[] args) {
		TreeMap<Integer,String> treemap= new TreeMap<Integer,String>();
		treemap.put(1, "vinayak");
		treemap.put(7, "ankit");
		treemap.put(3 , "shobhit");
		System.out.println("--------sort bu key------------");
	Set set=	treemap.entrySet();
	Iterator itr=	set.iterator();
		while (itr.hasNext()) {
		Map.Entry ee=(Map.Entry)itr.next();
	System.out.println("key is "+ee.getKey()+"value is"+ee.getValue());		
		}
		System.out.println("----------sort by value----------");
		
	
		Map<Integer, String> sortedvalue=sortbyvalue(treemap); 
		Set settree = sortedvalue.entrySet();
		Iterator itrtree = settree.iterator();
		while (itrtree.hasNext()) {
			Map.Entry metree = (Entry) itrtree.next();
			System.out.println("key is " + metree.getKey() + "value is"
					+ metree.getValue());

		}
		
		
	}

	 static Map<Integer, String> sortbyvalue(
			TreeMap<Integer, String> treemap) {
		// TODO Auto-generated method stub
		List list= new ArrayList(treemap.entrySet());
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object arg0, Object arg1) {

				Map.Entry e1 = (Entry) arg0;
				Map.Entry e2 = (Entry) arg1;
				// TODO Auto-generated method stub

				return ((Comparable) e1.getValue()).compareTo(e2.getValue());
				
				
				
			}
		});
		Map sortedHashMap= new LinkedHashMap();
		Iterator itr=  list.iterator();
		while (itr.hasNext()) {
		Map.Entry hh=	(Map.Entry)itr.next();
	//	sorttreemap.put(hh.getKey(), hh.getValue());
		sortedHashMap.put(hh.getKey(), hh.getValue());
			
		}
		
		return sortedHashMap;
		
		

		
	}

 
	  

}
