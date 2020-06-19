package GenricPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		
		String str="Better Butter";
		
		HashMap<Character,Integer> hmap= new HashMap<Character,Integer>();
		
		
		char ch[]=str.toCharArray();
		
		
		for (int i = 0; i < ch.length; i++) {
			
			if(!hmap.containsKey(ch[i]))
				hmap.put(ch[i], 1);
			
			else
				hmap.put(ch[i], hmap.get(ch[i])+1);
			
			
			
			
		}
		
		
		
	Set<Entry<Character,Integer>>	set=hmap.entrySet();
	
	
	for(Entry<Character,Integer> entry:set){
		
		System.out.println(entry.getKey()+"      "+entry.getValue());
		
	}
		Iterator itr=hmap.keySet().iterator();
		
		while(itr.hasNext()){
			Object obj=	itr.next();
			
			System.out.println(obj+"   "+hmap.get(obj));
		
		
		}
	
	
	
		
		
		
	}
	
	
}
