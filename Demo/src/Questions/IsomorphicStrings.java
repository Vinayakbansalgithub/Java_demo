package Questions;

import java.util.HashMap;
import java.util.Scanner;


// leetcode 205
public class IsomorphicStrings {

	static boolean find(String s1, String s2) {

		HashMap<Character, Character> c2c = new HashMap<Character, Character>();
		HashMap<Character, Boolean> c2b = new HashMap<Character, Boolean>();

		if (s1.length() != s2.length())
			return false;

		for (int i = 0; i < s1.length(); i++) {

			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			if (c2c.containsKey(c1)) {

				if (c2c.get(c1) != c2) {
					return false;
				}

			} else {

				if (!c2b.containsKey(c2)) {
					c2c.put(c1, c2);
					c2b.put(c2, true);

				}
			}

		}

		return true;

	}
	
	
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	// Class name should be "Source",
	// otherwise solution won't be accepted
	public class Source {



	    static String find(List<Integer> list){

	if(list.size()==1){
	    return "YES";
	}

	int num1;
	int num2;

	boolean even=false;

	int sum=0;

	for(int i=0;i<list.size();i++){

	if(list.size()==1){
	    return "YES";
	}

	    if(list.get(i)%2==0){
	    even= true;
	}

	for(int j=i+1;j<list.size();j++){
	if(list.size()==1){
	    return "YES";
	}


	if(list.get(j)%2==0 && even){
	sum=list.get(i)+list.get(j);
	list.remove(i);
	list.remove(j);
	list.add(sum);

	// remove element from array
	}else if(list.get(j)%2==1 && !even){
	sum=list.get(i)+list.get(j);
	list.remove(i);
	list.remove(j);
	list.add(sum);

	}


	}

	}


	        return "NO";
	    }
	    public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();

	        Scanner in = new Scanner(System.in);
	        
	        // Declare the variable
	        int a;
	        
	        // Read the variable from STDIN
	        a = in.nextInt();

	        
	        // Output the variable to STDOUT
	        System.out.println("total values "+a);

	    //    String line= in.nextLine();

	    //            System.out.println("line values "+line);


	    //    String[] arr= line.split(" ");

	       // System.out.println("total array length "+arr.length);

	      //  System.out.println(Arrays.toString(arr));

//	        for(int i=0;i<arr.length;i++){

	// list.add(Integer.parseInt(arr[i]));
//	        }

	list.add(1);
	list.add(2);
	list.add(3);



	System.out.print("00000   "+list);
	        find(list);
	   }
	}


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s1 = scan.nextLine();
		String s2 = scan.nextLine();

		boolean res = find(s1, s2);
		System.out.println(res);

	}

}
