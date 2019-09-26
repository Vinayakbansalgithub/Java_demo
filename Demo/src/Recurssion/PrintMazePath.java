package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class PrintMazePath {

	 static void getPath(int startx,int starty, int endx,int endy,String output) {
		// TODO Auto-generated method stub
		 
		 
		 if(startx==endx&&starty==endy) {
			 System.out.println(output);
		 }
		 if(startx>endx||starty>endy) {
			return;
		 }
		 
		 
		getPath(startx+1,starty,endx,endy,output+"H");
		 getPath(startx,starty+1,endx,endy,output+"V");
		 getPath(startx+1,starty+1,endx,endy,output+"D");
		
		 
	}
	public static void main(String[] args) {
		getPath(0,0,3,3,"");
	}
	

	
	}
