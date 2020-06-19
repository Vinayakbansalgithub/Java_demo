package LeetCode;

import java.nio.Buffer;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
   static HashSet<Character> set = new HashSet<Character>();	
   
   static String longest(String str){
	   String longestOverAll = "";
       String longestTillNow = "";

       for (int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);

           if (set.contains(c)) {
               longestTillNow = "";
               set.clear();
           }
           longestTillNow += c;
           set.add(c);
           if (longestTillNow.length() > longestOverAll.length()) {
               longestOverAll = longestTillNow;
           }
       }

       return longestOverAll;
   }
		
		
	
	
public static void main(String[] args) {
	String str ="pwwkew";
	String ss=LongestSubstringWithoutRepeatingCharacters.longest(str);
	System.out.println(ss);
}
}
