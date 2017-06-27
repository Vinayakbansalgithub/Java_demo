package SelFrDemo;

import java.util.Scanner;




public class PrimeNumber {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int numInput=sc.nextInt();
	
	//int num=38;
	//int till=num/2;
	int till=numInput/2;
	
	boolean flag=true;
	for(int i=2;i<till;i++){
		if(numInput%i==0){
			flag=false;
			
		}
		
	
	}
	System.out.println(flag);
}
}
