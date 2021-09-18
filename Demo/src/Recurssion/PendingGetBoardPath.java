package Recurssion;

import java.util.ArrayList;


// pending
public class PendingGetBoardPath {
 static ArrayList<String> getPath(int start, int end) {
	 ArrayList<String> result=new ArrayList<>();
	 if(start==end) {
		 ArrayList<String> br=new ArrayList<>();
		br.add("\n");
		return br;
	 }
	 if(start>end) {
		 ArrayList<String> br=new ArrayList<>();
			return br;
		 }
	 
	 
	 for (int dice = 1; dice <= 6; dice++) {
		 ArrayList<String> rr= getPath(start+dice,end);
	for (int i = 0; i < rr.size(); i++) {
		result.add(dice+""+rr.get(i));
	}
	
	}
		return result;
	}
	
public static void main(String[] args) {
	ArrayList<String> finalResult=getPath(0,10);
	System.out.println(finalResult);
}


}
