package SelFrDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubstringReverse {
	public static String reverse(String s) {
		   int k = s.indexOf(" ");
		   return k == -1 ? s : reverse(s.substring(k + 1)) + " " + s.substring(0, k);
		}

	
	/*public static String reverse(String s) {
		StringBuilder sb= new StringBuilder();
		 int k = s.indexOf(" ");
		 if(k!=-1)
		 {
			 sb.append(s.substring(k + 1)+" ");
		  reverse(s.substring(k + 1));
		 }
		return s;
		
	}
	*/
	
	
public static void main(String[] args) throws IOException {
	/*BufferedReader br = null;
	char ch;
	br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter string");
	String name = br.readLine();*/
	
	String name="hello to the new day";
	String str=reverse(name);
	
	
	System.out.println(str);
	//System.out.println("[" + reverse(name) + "]");
	/*String[] arr=name.split(" ");
	
	for (int i = arr.length-1; i >=0; i--) {
		sb.append(arr[i]+" ");
	}
System.out.println(sb.toString());*/
	
	
	
}
}
