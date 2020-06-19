package SelFrDemo;

public class MethodHidingMain {
public static void main(String[] args) {
	
	//whose object is created that overiden function will be called
	
	
	Animal a = new Animal();
	Animal b = new MethodHiding();
	MethodHiding c = new MethodHiding();
	Animal d = null;
	
	a.fun(); 
	b.fun(); 
	c.fun();
	d.fun(); 
	
}
}
