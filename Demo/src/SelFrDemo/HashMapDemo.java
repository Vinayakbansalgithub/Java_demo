package SelFrDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


// in this program we are also sorting value using comparator interface using annonemyus inner class



public class HashMapDemo {
	public static void main(String[] args) {
		HashMapDemo obj= new HashMapDemo();
		// hashmap not maintain insertion order
		Hashtable<Integer, String> hmap = new Hashtable<Integer, String>();
		hmap.put(5, "A");
		hmap.put(5, "A");
		hmap.put(5, "B");

		hmap.put(11,"C");
		hmap.put(4, "Z");
		hmap.put(77,"Y");
		hmap.put(9, "P");
		hmap.put(66,"Q");
		hmap.put(0, "R");
	//	System.out.println(hmap.get(5));
		System.out.println("---use for ---");
		
		for(Map.Entry e: hmap.entrySet())
		{
			System.out.println("key is "+e.getKey()+"  value is "+e.getValue());
			
		}
		System.out.println("---use while---");
		
		Iterator itr=hmap.entrySet().iterator();
		
		while(itr.hasNext()){
			
	Map.Entry e=(Map.Entry)itr.next();		
		
		System.out.println("key is "+e.getKey()+"   value is "+e.getValue());
		}
		System.out.println("---use list---");
		
		
	
		Set set=hmap.keySet();
	ArrayList list= new ArrayList(set);		
	Collections.sort(list);
		
		
	Iterator itrrr=	list.iterator();
	while(itrrr.hasNext()){
		Map.Entry ee= (Entry)list;
		System.out.println("key is "+ee.getKey()+"   value is "+ee.getValue());

	}
		
		/*Set<Map.Entry<Integer, String>> set= hmap.entrySet();
		
		List list= new ArrayList(set);
		
		for(Iterator itr1=list.iterator();itr1.hasNext();){
			System.out.println("last  "+itr1.next());
			
			
		}*/
	HashMap<Integer,String> sortedvale=	obj.sortbyvalue(hmap);
		
	Iterator last=sortedvale.entrySet().iterator();
		while(last.hasNext()){
		Map.Entry entry	=(Entry)last.next();
			
			System.out.println("---value after sort by value---");
			System.out.println("key is  "+entry.getKey()+" value is  "+entry.getValue());
		}

		
		
	}

	  HashMap<Integer,String> sortbyvalue(Hashtable<Integer, String> hmap) {
		// TODO Auto-generated method stub
	
		 Set<Map.Entry<Integer, String>> set=hmap.entrySet();
		List<Map.Entry<Integer,String>> list= new ArrayList<Map.Entry<Integer, String>>(set);
		
		Collections.sort(list, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				
				return	((Comparable)((Map.Entry) o1).getValue()).compareTo((Comparable)((Map.Entry)o2).getValue())	;			
				
			}
			
			
			
		});
		
		
		LinkedHashMap link= new LinkedHashMap();
		
		for(Iterator itr= list.iterator();itr.hasNext();){
			
			
			Map.Entry entry=(Map.Entry)itr.next();
			
			link.put(entry.getKey(), entry.getValue());
		}
		return link;  
	}
}