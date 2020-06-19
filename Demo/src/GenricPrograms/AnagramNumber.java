package GenricPrograms;

import java.util.Arrays;

public class AnagramNumber {
public static void main(String[] args) {
	
	
	String str1="mother in law";
	String str2="hitler woman";
	
	char c1[]=str1.trim().replaceAll("\\s", "").toCharArray();
	
	
	char c2[]=str2.trim().replaceAll("\\s", "").toCharArray();

	
	Arrays.sort(c1);
	
	Arrays.sort(c2);
	
	System.out.println(Arrays.toString(c1)+" -----  "+Arrays.toString(c2));
	

}

}
