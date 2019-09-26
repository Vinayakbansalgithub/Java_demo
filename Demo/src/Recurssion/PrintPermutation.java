package Recurssion;

import java.util.Arrays;

public class PrintPermutation {
	
	 static void printper(String input,String output) {
		 
		 

			// TODO Auto-generated method stub
		 if (input.length() == 0) {
			 System.out.println("Value:"+output);
			 }
		 
		for (int i = 0; i < input.length(); i++) {
			//System.out.println("new Input:"+input.substring(0,i)+input.substring(i+1));
			//System.out.println("new output:"+output+input.charAt(i));;
			
			printper(input.substring(0,i)+input.substring(i+1),output+input.charAt(i));
		}
			
		}
	
	public static void main(String[] args) {
		String str = "HELLO";
		printper(str,"");
		
	}

	
}
