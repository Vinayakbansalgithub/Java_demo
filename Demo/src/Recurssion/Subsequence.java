package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence {
	static List<String> getSubSequenceIncomplete(String str, int start, int end) {
		List<String> list = new ArrayList<String>();
		if (start == str.length()) {
			//System.out.println("value: ");
			list.add("");
			return list;
		}
		if (end == str.length()) {
			List<String> temp = getSubSequenceIncomplete(str, start + 1, start + 1);
			list.addAll(temp);
			return list;
		} else {
			// System.out.println("value: "+str.substring(start, end+1));
			list.add(str.substring(start, end + 1));
			List<String> temp = getSubSequenceIncomplete(str, start, end + 1);
			list.addAll(temp);
			return list;
		}
		
	}
	private static String[] getSubSequence(String str) {
		// TODO Auto-generated method stub
		
		if(str.length()==0) {
			String arr[]= {""};
			return arr;
		}
		String temp[]=getSubSequence(str.substring(1));
		String result[]=new String[2*temp.length];

		int k=0;
		for (int i=0;i<temp.length;i++)
		{
			result[k]=temp[i];
		k++;
		}
		
		for (int i=0;i<temp.length;i++) {
			result[k]=str.charAt(0)+temp[i];
			k++;
		} 
		
		return result;
		
	}
	public static void main(String[] args) {
	String str="abcd";
		List<String> list= new ArrayList<String>();
//		for (int i = 0; i < str.length(); i++) {
//			
//			
//			String current = str.charAt(0)+"";
//			
//			List<String> temp = getSubSequenceIncomplete(str.substring(i+1), 0, 0);
//			 list.addAll(temp);
//			 for (int j = 0; j < temp.size(); j++) {
//				 list.add(str.charAt(i)+temp.get(j));
//			}
//			
//
//			
//		}
		String arr[]= getSubSequence(str);

		System.out.println("For string: "+str);
		//System.out.println(LIn);
		System.out.println(Arrays.deepToString(arr));

	}

	

}
