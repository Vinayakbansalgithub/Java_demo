package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

public class ForEachExample {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 12, 433, 5);

		Optional<Integer> max = integers.stream().reduce(Math::max);

		max.ifPresent(System.out::println);

		List<String> datas = Arrays.asList("data1", "data2", "DDD", "data4");
		datas.forEach((data) -> System.out.println(data));
		System.out.println("===========>");
		datas.forEach(System.out::println);
		System.out.println("===========<>");
		datas.forEach(word -> System.out.println(word.toUpperCase()));
		System.out.println("===========<");
		datas.forEach(word -> System.out.println(StringUtils.isAllUpperCase(word)));
		System.out.println("===========");
		Stream<String> filteredData = datas.stream().filter(data -> data != "data1");
		filteredData.forEach((result) -> System.out.println(result));

		System.out.println("===========");
		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		// using default BiConsumer action
		map.forEach((key, value) -> System.out.println("key: " + key + ",value: " + value));

		System.out.println("===========");

		String[] str = { "Vinayak", "Mehul", "Arpit" };
		System.out.println("Array...");
		for (String res : str)
			System.out.print(res + " ");
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String one, String two) {
				int val = one.compareTo(two);
				return val;
			}
		});
		System.out.println("\nSorted array...");
		for (String res : str)
			System.out.print(res + " ");

		System.out.println("===========");

		Arrays.sort(str, ((a, b) -> a.compareTo(b)));
		for (String res : str)
			System.out.print(res + " ");

		System.out.println("===== Reference to an Instance Method of an Arbitrary Object of a Particular Type ======");

		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
		numbers.stream().sorted((a, b) -> a.compareTo(b));
		numbers.stream().sorted(Integer::compareTo);

		String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };

		Arrays.sort(stringArray, String::compareToIgnoreCase);

		Arrays.sort(stringArray, ((a, b) -> a.compareToIgnoreCase(b)));

		System.out.println(Arrays.toString(stringArray));
	}
}

/*
 * 
 * 
 * 
 * Foreach method in Iterable
 * 
 * it take one input and not return any value
 * 
 * default void forEach(Consumer<? super T> action) {
 * Objects.requireNonNull(action); for (T t : this) { action.accept(t); }
 */

/*
 * default void forEach(BiConsumer<? super K, ? super V> action) {
 * Objects.requireNonNull(action); for (Map.Entry<K, V> entry : entrySet()) { K
 * k; V v; try { k = entry.getKey(); v = entry.getValue(); } catch
 * (IllegalStateException ise) { // this usually means the entry is no longer in
 * the map. throw new ConcurrentModificationException(ise); } action.accept(k,
 * v); } }
 */