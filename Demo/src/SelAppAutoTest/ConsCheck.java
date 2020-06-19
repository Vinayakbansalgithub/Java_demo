package SelAppAutoTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Rideable {
	int rollNumber;
	  
	Rideable(int n){
	    rollNumber = n;
	  }}

public class ConsCheck extends Rideable{
	
	
	ConsCheck(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		
		byte g=(byte)128;
		System.out.println("+++"+g);
		
		int a = 1; 
		int b = 2;
		
		int c = (a * (b + 2)) - 10-4 * ((2*2) - 6); 

		System.out.println("000"+c);
		
		int num=8;
 int rem;
 String binary="";
			
while(num>0){
	
	rem=num%2;
	num=num/2;
	binary+=rem+"";
	

	
	
	
	
}
		System.out.println("---"+binary);
		
		
List<Rideable> students = new ArrayList<Rideable>();
        

students.add(new Rideable(1));
students.add(new Rideable(3));
students.add(new Rideable(4));
students.add(new Rideable(1));
students.add(new Rideable(3));

System.out.println(students.size());
		

	}
}
