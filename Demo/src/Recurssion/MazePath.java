package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class MazePath {

	 static List<String> getPath(int startx,int starty, int endx,int endy) {
		// TODO Auto-generated method stub
		 
		 List<String> result= new ArrayList();
		 
		 if(startx==endx&&starty==endy) {
			 System.out.println("reached end");
			 List<String> re= new ArrayList();
			 re.add("\n");
			 return re;
		 }
		 if(startx>endx||starty>endy) {
			 System.out.println("reached outside");
			 List<String> br= new ArrayList();
			 return br;
		 }
		 
		 
		List<String> x =getPath(startx+1,starty,endx,endy);
		for (String xs : x) {
			result.add("H"+xs);
		} 
		
		List<String> y = getPath(startx,starty+1,endx,endy);
		for (String ys : y) {
			result.add("V"+ys);
		} 
		
		List<String> d = getPath(startx+1,starty+1,endx,endy);
		for (String ds : d) {
			result.add("D"+ds);
		} 
		
		return result;
		 
	}
	public static void main(String[] args) {
		List<String> finalResult=getPath(0,0,3,3);
		System.out.println(finalResult);
	}
	

	
	}
