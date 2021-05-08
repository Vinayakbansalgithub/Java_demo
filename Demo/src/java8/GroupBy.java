package java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Item {

    private String name;
    private int qty;
    private BigDecimal price;
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Item(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}

    //constructors, getter/setters 
}
public class GroupBy {
public static void main(String[] args) {
    List<Item> items = Arrays.asList(
            new Item("apple", 10, new BigDecimal("9.99")),
            new Item("banana", 20, new BigDecimal("19.99")),
            new Item("orang", 10, new BigDecimal("29.99")),
            new Item("watermelon", 10, new BigDecimal("29.99")),
            new Item("papaya", 20, new BigDecimal("9.99")),
            new Item("apple", 10, new BigDecimal("9.99")),
            new Item("banana", 10, new BigDecimal("19.99")),
            new Item("apple", 20, new BigDecimal("9.99"))
    );
    
    
    
    Map<Integer, List<Item>> res=items.stream().collect(Collectors.groupingBy(Item::getQty));
    System.out.println(res);
    
    
    Map<String, Long> res1=items.stream().collect(Collectors.groupingBy(Item::getName,Collectors.counting()));
    System.out.println(res1);
    
    
    Map<String, Integer> res2=items.stream().collect(Collectors.groupingBy(Item::getName,Collectors.summingInt(Item::getQty)));
    System.out.println(res2);
    
    
    Map<BigDecimal, Set<String>> res3=items.stream().collect(Collectors.groupingBy(Item::getPrice,Collectors.mapping(Item::getName, Collectors.toSet())));
    System.out.println(res3);
}
}
