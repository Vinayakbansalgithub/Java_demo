package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashmapToTreeMap {
	 @SuppressWarnings("unchecked")
	HashMap<Integer,String> treemap(HashMap<Integer, String> tmap) {
		// TODO Auto-generated method stub
		 
		 Set<Map.Entry<Integer, String>> set= (Set<Entry<Integer, String>>)tmap.entrySet();
		 List<Map.Entry<Integer, String>> list= new ArrayList<Map.Entry<Integer,String>>(set);
		 Collections.synchronizedList(list);
		 Collections.sort(list, new Comparator() {

			

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
			
				
				// sort by key
			//	return		((Integer)((Map.Entry) o1).getKey()).compareTo((Integer)((Map.Entry)o2).getKey());
			
				//sort by value
				return  ((Comparable)((Map.Entry)o1).getValue()).compareTo((Comparable)((Map.Entry)o2).getValue());
				//return	((Comparable) e1).compareTo(e2);
				
			}
		});
		LinkedHashMap<Integer, String> lmap= new LinkedHashMap<Integer, String>();
		Iterator itrr=list.iterator();
		 while (itrr.hasNext()) {
			Map.Entry<Integer,String> e= (Map.Entry) itrr.next();
			lmap.put(e.getKey(), e.getValue());
			
		}
		 return lmap;
		
	}
	
	
	public static void main(String[] args) {
		
		HashmapToTreeMap obj= new HashmapToTreeMap();
		

		 HashMap<Integer, String> map= new  HashMap<Integer, String>();
		map.put(1, "bansal");
		map.put(3, "kumar"); 
		map.put(5, "verma");
		map.put(7, "sunny");
		map.put(2, "bansal");
		map.put(4, "kumar"); 
		map.put(5, "verma");
		map.put(6, "sunny");
		map.put(9, "bansal");
		map.put(0, "kumar"); 
Iterator itrd=map.entrySet().iterator();
		
		while(itrd.hasNext()){
			
	Map.Entry e=(Map.Entry)itrd.next();		
		
		System.out.println("key is "+e.getKey()+"   value is "+e.getValue());
		}
	HashMap<Integer, String> treemap=	obj.treemap(map);
	
	Set s=treemap.entrySet();
Iterator itr=	s.iterator();
while (itr.hasNext()) {
	Map.Entry ent=(Map.Entry)itr.next();
	System.out.println(ent.getKey()+"   "+ent.getValue());
	
}
	
/*Set set= map.entrySet();	

Iterator itrer=set.iterator();
	while (itrer.hasNext()) {
		Map.Entry e=(Map.Entry)itrer.next();		
		System.out.println(e.getValue());*/
		
	}
		
}
