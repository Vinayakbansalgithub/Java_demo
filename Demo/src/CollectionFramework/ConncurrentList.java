package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConncurrentList {
	private static final Object PRESENT = new Object();
public static void main(String[] args) {
	ArrayList<Integer> arr= new ArrayList<Integer>();
	arr.add(1);
	arr.add(2);
	arr.add(3);
	arr.add(4);
	arr.add(5);
	
	Iterator itr=arr.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		arr.add(17);
	}
	
	ConcurrentHashMap<Integer, Object> map= new ConcurrentHashMap<Integer, Object>();
	 for (Integer i : arr) {
		 map.put(i,PRESENT);
}
	
Set ss=map.entrySet();
	Iterator itrr=ss.iterator();
	while(itrr.hasNext()){
		Map.Entry ee=(Map.Entry)itrr.next();
		System.out.println(ee.getKey());
		
		arr.add(9);
	}
	
}
}
