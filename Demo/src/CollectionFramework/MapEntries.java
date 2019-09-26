package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lombok.ToString;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;

public class MapEntries {

	public static void main(String[] args) {

		Function<String, Void> print = (var s) -> {
			System.out.println(s);
			return null;
		};

		//Map<String, Integer> maps = Map.ofEntries(Map.entry("z", 0));

		HashMap<String, Integer> maps = new HashMap<>();

		maps.put("vishal", 10);
		maps.put("sachin", 30);
		maps.put("vaibhav", 20);

//		Set<Entry<String, Integer>> set = map.entrySet();
//		Iterator itr = set.iterator();		
//		while(itr.hasNext()) {
//			Map.Entry e =(Entry) itr.next();
//            System.out.println(e.getKey() + " " + e.getValue()); 
//
//		}

		// With Lambdas
		maps.forEach((k, v) -> System.out.println(k + ":" + v));

		// Stream API
		maps.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

	}
}
