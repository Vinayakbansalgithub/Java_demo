package SelFrDemo;

public class CloanableDemo implements Cloneable {
	
	void print()
	{
		System.out.println("the object is printed"+this);
	}
	
	Object Clone() throws CloneNotSupportedException
	{
		return clone();
	}
	
	
public static void main(String[] args) throws CloneNotSupportedException {
	
	Integer i;
	String s;
	
	CloanableDemo cd= new CloanableDemo();
	CloanableDemo cdcloan= cd;
			//(CloanableDemo)cd.clone();
	cd.print();
	cdcloan.print();
	
}
}
