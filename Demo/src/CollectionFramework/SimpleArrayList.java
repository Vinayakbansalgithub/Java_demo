package CollectionFramework;
import java.util.*;

public class SimpleArrayList {
public static void main(String[] args) {
	ArrayList<String> list= new ArrayList<String>();
	list.add("vinayak");
	list.add("karan");
	list.add("mehul");
	
	Iterator itr=list.iterator();
	for (String string : list) {
		System.out.println(string);
	}
	
	
	
	HashMap<Integer, String> map= new HashMap<Integer, String>();
	map.put(1, "vinayak");
	map.put(2, "ankit");
	map.put(3, "shobhit");
	
	
	Set set=map.entrySet();
Iterator<Map.Entry> itrmap=  set.iterator();
	
while (itrmap.hasNext()) {
Map.Entry e=(Map.Entry)itrmap.next();
System.out.println(e.getValue()+"   "+e.getKey());
}
}
}