package SelFrDemo;

public class CloanableDemo implements Cloneable {
	
	void print()
	{
		System.out.println("the object is printed");
	}
	
	Object Clone() throws CloneNotSupportedException
	{
		return clone();
	}
	
	
public static void main(String[] args) throws CloneNotSupportedException {
	CloanableDemo cd= new CloanableDemo();
	CloanableDemo cdcloan= (CloanableDemo)cd.clone();
	cd.print();
	cdcloan.print();
	
}
}
