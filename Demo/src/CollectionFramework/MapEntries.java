package CollectionFramework;

import java.util.List;
import lombok.ToString;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class MapEntries {

	public static void main(String[] args) {
		
		
		Function<String, Void> print = (var s) -> {
		    System.out.println(s);
		    return null;
		};
		
		
		Map<String, Integer> map = Map.ofEntries(Map.entry("z",0));

		
		
	}
}
