package SelFrDemo;

import java.util.Deque;
import java.util.LinkedList;

public class BracketCheck {
public static void main(String[] args) {
	String str ="[[[[]]]][][";
	int count = 0;

	
	LinkedList<Character> arr = new LinkedList<>();
	for (char c : str.toCharArray()) {  // str is the string you are searching
		 switch (c) {
         case '[':
             arr.addLast(c);
             
             break;
         case ']':
        	 if(arr.contains('['))
        	 {
        		 count++;
        		 }
             arr.removeLast();
            break;
            
             
     }
 }System.out.println(count);
 if(!arr.isEmpty()){
	 
	 System.out.println("extra value"+arr);
 }
 
	}
	
	
}

