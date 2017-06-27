package SelFrDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> arrobj = new ArrayList<String>();
		arrobj.add("Alive is awesome");
		arrobj.add("Love yourself");
		System.out.println("ArrayList object output :" + arrobj);

		CopyOnWriteArrayList<String> coponwrtobj =

		new CopyOnWriteArrayList<String>(arrobj);
		//coponwrtobj.add("Alive is awesome");
		//coponwrtobj.add("Love yourself");
		//coponwrtobj.add("help yourself");

		Iterator<String> failSafeIterator = coponwrtobj.iterator();
		while (failSafeIterator.hasNext()) {
			System.out.printf("Read from CopyOnWriteArrayList : %s %n",
					failSafeIterator.next());
			coponwrtobj.add("bye");
			// failSafeIterator.remove();
			// not supported in CopyOnWriteArrayList in Java

		}
		
		Iterator<String> iit= coponwrtobj.iterator();
		while(iit.hasNext())
		{
			System.out.println("new values "+iit.next());
		}
	
	}
}
