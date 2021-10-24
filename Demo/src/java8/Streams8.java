package java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams8 {

	public static void main(String[] args) {

		class Item {

			private String name;
			private int qty;
			private Double price;

			public Item(String name, int qty, Double price) {
				super();
				this.name = name;
				this.qty = qty;
				this.price = price;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getQty() {
				return qty;
			}

			public void setQty(int qty) {
				this.qty = qty;
			}

			public Double getPrice() {
				return price;
			}

			public void setPrice(Double price) {
				this.price = price;
			}

			@Override
			public String toString() {
				return "Item [name=" + name + ", qty=" + qty + ", price=" + price + "]";
			}

			// constructors, getter/setters

		}

		// stream work directly on collections and for array we have to use arrys.stream
		Integer[] array = new Integer[] { 1, 3 };// {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};

		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(array).collect(Collectors.toList());
		for (Integer integer : list) {
			System.out.println(integer);
		}

		int arr[] = { 1, 2, 3, 4, 5 };
		List<Integer> s = IntStream.of(arr).boxed().collect(Collectors.toList());

		// Arrays.asList(arr);

		OptionalDouble avg = IntStream.of(arr).average();

		System.out.println("avg is " + avg.getAsDouble());

		// 3 apple, 2 banana, others 1
		List<Item> items = Arrays.asList(new Item("watermelon", 10, new Double("9.99")),
				new Item("banana", 20, new Double("19.99")), new Item("orang", 10, new Double("29.99")),
				new Item("watermelon", 10, new Double("29.99")), new Item("papaya", 20, new Double("9.99")),
				new Item("cupcake", 10, new Double("9.99")), new Item("cupcake", 20, new Double("9.99"))

		);

		Map<String, List<Item>> groupOnKey = items.stream().collect(Collectors.groupingBy(Item::getName));
		System.out.println("based on key will give all values   " + groupOnKey);

		// count on attribute
		Map<String, Long> counting = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		System.out.println(counting);

		Map<String, Double> sum = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.averagingDouble(Item::getQty)));
		System.out.println(sum);
		
		
		BinaryOperator<String> maxLengthString = BinaryOperator.maxBy(Comparator.comparingInt(String::length));
		String ss = maxLengthString.apply("two", "three");
		System.out.println(ss);
		

		// Make sure key is unique
		/*
		 * Map<String, Double> mapNamePrice =
		 * items.stream().collect(Collectors.toMap(Item::getName, Item::getPrice));
		 * 
		 * Iterator itr = mapNamePrice.entrySet().iterator(); while (itr.hasNext()) {
		 * Map.Entry<String, BigDecimal> entry = (Entry<String, BigDecimal>) itr.next();
		 * System.out.println("key is " + entry.getKey() + "  value is " +
		 * entry.getValue()); }
		 */


		
		// key as item name and its max price object
		Map<String, Item> mapNamePrice2 = items.stream().collect(Collectors.toMap(Item::getName, Item -> Item,
				BinaryOperator.maxBy(Comparator.comparingDouble(item -> item.getPrice()))));

//		Iterator itr1 = mapNamePrice2.entrySet().iterator();
//		while (itr1.hasNext()) {
//			Map.Entry<String, BigDecimal> entry = (Entry<String, BigDecimal>) itr1.next();
//			System.out.println("key is " + entry.getKey() + "  value is " + entry.getValue());
//		}
		mapNamePrice2.entrySet().stream()
	      .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

	}
}
