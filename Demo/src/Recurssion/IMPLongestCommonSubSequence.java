package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;

// abc acd
public class IMPLongestCommonSubSequence {
	static ArrayList<String> getSubSequence(String str) {
		// TODO Auto-generated method stub

		if (str.length() == 0) {
			ArrayList<String> templist = new ArrayList<String>();
			templist.add("");
			return templist;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> finalres = new ArrayList<String>();
		;
		ArrayList<String> res = getSubSequence(ros);

		for (int i = 0; i < res.size(); i++) {
			finalres.add(res.get(i));
			finalres.add(cc + res.get(i));

		}

		return finalres;
	}

	
	static int getLCS(String str1,String str2) {
		
		
		
		if(str1.length()==0 || str2.length()==0)
			return 0;
		
		char s1= str1.charAt(0);
		char s2= str2.charAt(0);
		
		
		String ros1=str1.substring(1);
		String ros2=str2.substring(1);
		
		int length=0;
		if(s1==s2) {
			
			length = getLCS(ros1,ros2)+1;
			
		}else {
			
			int c1=getLCS(str1,ros2);
			int c2=getLCS(ros1,str2);
			
			
			length= Math.max(c1, c2);
		}

		
		
		return length;
		// TODO Auto-generated method stub
	}
	
	
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "acd";

//		ArrayList<String> arr1 = getSubSequence(str1);
//		ArrayList<String> arr2 = getSubSequence(str2);
//
//		ArrayList<String> list = new ArrayList<String>();
//
//		for (int i = 0; i < arr1.size(); i++) {
//			for (int j = 0; j < arr2.size(); j++) {
//
//				System.out.println(arr1.get(i) + "===" + arr2.get(j));
//				if (arr1.get(i).contentEquals(arr2.get(j))) {
//					list.add(arr2.get(j));
//
//				}
//			}
//		}
//
//		System.out.println(list);

		
		int res=getLCS(str1,str2);
		System.out.println(res);
		
		
	}

}
