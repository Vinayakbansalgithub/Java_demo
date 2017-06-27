package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Streams8 {
public static void main(String[] args) {

	// stream work directly on collectionoand for array we have to use arrys.stream 
	Integer[] array = new Integer[]{1,3};//{"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
	
ArrayList<Integer> list=(ArrayList<Integer>) Arrays.stream(array).collect(Collectors.toList());
for (Integer integer : list) {
	System.out.println(integer);
}
	
}
}
