package SelFrDemo;

import java.util.Arrays;

public class ArraylistImplementation {
	 Object[] object;
	int size;
	
	public ArraylistImplementation() {
		// TODO Auto-generated constructor stub
	object= new Object[10];
}
	
	 void  increaseSize(){

		 object = Arrays.copyOf(object,object.length+(object.length/2)); 


		//object[newLength];
		
		System.out.println("d");
	}
	
	void add(Object obj)
	{
		if(object.length-size<5){
increaseSize();
		}
		object[size++]=obj;
	}
	
	
	
	void get(int i){
		System.out.println("value at index "+i+" is "+object[i]);
		
		
	}
	
	public static void main(String[] args) {
		ArraylistImplementation arr= new ArraylistImplementation();
		arr.add(new Integer(10));
		arr.add(new Integer(20));
		arr.add(new Integer(30));
		arr.add(new Integer(40));
		arr.add(new Integer(10));
		arr.add(new Integer(20));
		arr.add(new Integer(30));
		arr.add(new Integer(40));
		arr.add(new Integer(10));
		arr.add(new Integer(20));
		arr.add(new Integer(30));
		arr.add(new Integer(40));
		arr.add(new Integer(10));
		arr.add(new Integer(20));
		arr.add(null);
		
		arr.get(4);
		arr.get(9);
		arr.get(10);
	}

}
