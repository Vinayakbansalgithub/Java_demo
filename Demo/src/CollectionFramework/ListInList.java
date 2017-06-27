package CollectionFramework;
import java.util.*;
public class ListInList {
public static void main(String[] args) {
	Integer[] arr={1,2,3,5,6};
	ArrayList<Integer> list1= new ArrayList<Integer>(Arrays.asList(arr));
	ArrayList<Integer> list2= new ArrayList<Integer>();
	list2.add(3);
	list2.addAll(list1);
	System.out.println(list2);

	
	
	
}
}
