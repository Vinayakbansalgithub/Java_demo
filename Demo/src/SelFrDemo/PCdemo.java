package SelFrDemo;

import java.util.ArrayList;
import java.util.List;

public class PCdemo {
	
	
	
	
public static void main(String[] args) {
	List<Integer> list= new ArrayList<Integer>();
	int max=5;
	
	Thread t1= new Thread(new PThread(list,max),"producer");
	Thread t2= new Thread(new CThread(list),"consumer");
	t1.start();
	t2.start();
}

}
