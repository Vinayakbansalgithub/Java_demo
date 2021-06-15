package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class GetSubstring {

	static String[] convert(String input, int start, int end) {
		// TODO Auto-generated method stub

		if (input.isEmpty()) {
			String strblank[] = new String[1];
			strblank[0]="";
			return strblank;
		}
		char charToConsider = input.charAt(0);
		String resultArr[] = convert(input.substring(1), start, end);

		String finalArr[] = new String[resultArr.length * 2];

		int k = 0;
		for (int i = 0; i < resultArr.length; i++) {
			finalArr[k] = resultArr[i];
			k++;
		}
		for (int i = 0; i < resultArr.length; i++) {
			finalArr[k] = charToConsider+resultArr[i];
			k++;
		}

		return finalArr;
	}

	public static void main(String[] args) {
//		String[] output = convert("123", 0, 2);
//		System.out.println(output.length);
//
//		System.out.println(Arrays.toString(output));
//		
		
		convert2("123","");
		
		

	}

	private static void convert2(String ques, String ans) {
		// TODO Auto-generated method stub
		
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		
			
			char ch= ques.charAt(0);
			convert2(ques.substring(1),ans+ch);
			
			convert2(ques.substring(1),ans+"");
		
	
		
	}
}
