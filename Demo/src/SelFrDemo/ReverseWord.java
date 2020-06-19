package SelFrDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWord {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		char ch;
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string");
		String name = br.readLine();
		char[] newarr= new char[50];
		
		String[] arr = name.split(" ");
		int k=0;
		for (int i = 0; i < arr.length; i++) {
		
			int length = arr[i].length() - 1;
			
			
			while (length != -1) {

				ch = arr[i].charAt(length);
				newarr[k] = ch;
				k++;
				length--;
			}
			newarr[k]=' ';
			k++;
			
			}
		for (int j = 0; j < newarr.length; j++) {
			System.out.print(newarr[j]);

		}
	}
}