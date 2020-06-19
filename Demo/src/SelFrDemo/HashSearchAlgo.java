package SelFrDemo;

import java.util.Hashtable;

public class HashSearchAlgo {
	
	public void search(int key) {
		// TODO Auto-generated method stub
		int hashvalue= hashCode(key);
		System.out.println("hash code is "+hashvalue);
		
		
		 
		
		
	}
	
public int hashCode(int key) {
	hashCode(key);
		// TODO Auto-generated method stub
	   int value= key%10;
	
	
		return value;
	}

public static void main(String[] args) {
	HashSearchAlgo obj= new HashSearchAlgo();
	
	
	Hashtable<Integer,String > algo=new Hashtable<Integer,String>();
	algo.put(21,"vinayak");
	algo.put(45,"himani");
	algo.put(78,"ankit");
	algo.put(66,"raunak");
	

	
	obj.search(78);
	
	
}


}
