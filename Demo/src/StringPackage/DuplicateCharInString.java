package StringPackage;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class DuplicateCharInString {
	
public static void main(String[] args) {
	Integer i=12345;
String str1= new String(i.toString());
System.out.println(str1.length());

	
	DuplicateCharInString obj = new DuplicateCharInString();
	String str="vinayak bansal is a good boy";
	char[] ch= str.toCharArray();
	
	
	HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
	for (char c : ch) {
		
		if(hmap.containsKey(c)){
			hmap.put(c, hmap.get(c)+1);
		}
		else
		hmap.put(c, 1);
	}
Set<Entry<Character, Integer>> entry=hmap.entrySet();
for (Entry<Character, Integer> set : entry) {
	if(set.getValue()>1){
		System.out.println("number of repeat char "+set.getKey() +" is "+set.getValue());
	}
}
	
	
	
	
}
	
}

