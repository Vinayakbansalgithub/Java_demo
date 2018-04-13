package Questions;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.jasper.tagplugins.jstl.core.Choose;

public class AllStringCombinations {
	
	private static void permutation(String str, int l, int r)
    {
        if (l == r){
        	System.out.println("("+l+","+r+")");

            System.out.println(str);

        }else
        {
            for (int i = l; i <= r; i++)
            {
            	System.out.println("("+l+","+i+")");
                str = swap(str,l,i);
                permutation(str, l+1, r);
              //  str = swap(str,l,i);
            }
        }
    }
 
    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
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
	
	
	
	
	String input="MNN";
	int n = input.length();
	permutation(input, 0, n-1);
}



}
