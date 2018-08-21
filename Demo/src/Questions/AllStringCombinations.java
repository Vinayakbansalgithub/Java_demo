package Questions;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.jasper.tagplugins.jstl.core.Choose;

public class AllStringCombinations {
	
	private static void permutation(String str, int start, int end)
    {
        if (start == end){
        	System.out.println("("+start+","+end+")");

            System.out.println(str);
            return;

        }else
        {
            for (int i = start; i <= end; i++)
            {
            	System.out.println("("+start+","+i+")");
                str = swap(str,start,i);
                permutation(str, start+1, end);
              //  str = swap(str,l,i);
            }
        }
    }
 
   
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

public static void main(String[] args) {
	
	
	
	String input="abc";
	int n = input.length();
	permutation(input, 0, n-1);
}



}
