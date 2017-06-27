package SelFrDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class StudentCheck{
	String name;
	int roll;
	public StudentCheck(String name, int roll) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.roll=roll;
		
	}
	void setName(String name){
		this.name=name;
	}
	void setRoll(int roll){
		this.roll=roll;
		
	}
	String getName(){
		return name;
	}
	int getRoll(){
		return roll;
	}
	public String toString(){
		return name+roll;
		
	}
}
class SortByNameed implements Comparator<StudentCheck>{

	@Override
	public int compare(StudentCheck o1, StudentCheck o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
		
	}
}
	class SortByRoll implements Comparator<StudentCheck>{

		@Override
		public int compare(StudentCheck o1, StudentCheck o2) {
			// TODO Auto-generated method stub
			return o2.name.compareTo(o1.name);
			
		}
	
	
}

public class ComCheck {
public static void main(String[] args) {
	ArrayList<StudentCheck> arr= new ArrayList<StudentCheck>();
	StudentCheck sc1= new StudentCheck("vinayak",123);
	StudentCheck sc2= new StudentCheck("Animesh",333);
	arr.add(sc1);
	arr.add(sc2);
	Collections.sort(arr, new SortByRoll());
   System.out.println("values"+arr);

	
}
}
