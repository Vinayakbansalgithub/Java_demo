package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetSubsequence {

	private static ArrayList<String> getSubSequence(String str) {
		// TODO Auto-generated method stub

		if (str.length() == 0) {
			ArrayList<String> templist = new ArrayList<String>();
			templist.add("");
			return templist;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> res = getSubSequence(ros);
		ArrayList<String> finalres = new ArrayList<String>();

		for (int i = 0; i < res.size(); i++) {
			finalres.add(res.get(i));
			finalres.add(cc + res.get(i));

		}

		return finalres;
	}

	public static void main(String[] args) {
		String str = "abc";
		List<String> list = new ArrayList<String>();

		ArrayList<String> s = getSubSequence(str);

		System.out.println(s);
		
		
		
		

	}

}
