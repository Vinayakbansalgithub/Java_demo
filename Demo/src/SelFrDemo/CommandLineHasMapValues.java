package SelFrDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CommandLineHasMapValues {
	static Integer highest = 0;

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		CommandLineHasMapValues obj = new CommandLineHasMapValues();

		System.out.println("...............HashMap..............");
		String[] data = { "vinayak", "bansal", "works", "in", "puresoftware",
				"vinayak", "vinayak", "works", "vinayak", "vinayak", "works",
				"works", "puresoftware" };
		for (String in : data) {
			Integer i = hm.get(in);
			hm.put(in, (i == null) ? 1 : i + 1);
		}
		System.out.println(hm);
		System.out.println("-----------key set---------");
		for (String keyis:hm.keySet() ) {
			
			
			System.out.println("keys are   "+keyis);
		
		}
		
		System.out.println("-----------Entryset set---------");
		for (Map.Entry<String, Integer> e : hm.entrySet())
		    System.out.println(e.getKey() + ": " + e.getValue());
		
		
		for (String in : data) {
			Integer i = hm.get(in);

			if (i > highest) {
				highest = i;
			}

		}
		System.out.println("hello vinayak");
		System.out.println("highest value is    " + highest
				+ "   and the key/keys is   " + obj.keyAgainstValue(hm));

	}

	public ArrayList<String> keyAgainstValue(HashMap<String, Integer> hm) {

		ArrayList<String> keylist = new ArrayList<String>();

		// TODO Auto-generated method stub

		for (Entry<String, Integer> entry : hm.entrySet()) {

			if (highest.equals(entry.getValue())) {
				keylist.add(entry.getKey());
				// arr is key

			}
		}
		return keylist;
	}
}
