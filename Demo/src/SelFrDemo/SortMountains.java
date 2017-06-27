package SelFrDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mountains {
	String name;
	int height;

	public Mountains(String name, int height) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.height = height;
	}

	int getHeight() {
		return height;
	}

	String getName() {
		return name;
	}

	public String toString() {
		return name + "   " + height;

	}
}

class SortbyName implements Comparator<Mountains> {

	@Override
	public int compare(Mountains o1, Mountains o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}

class SortbyHeight implements Comparator<Mountains> {

	@Override
	public int compare(Mountains o1, Mountains o2) {
		// TODO Auto-generated method stub
		// reverse height
		return o2.height - o1.height;
	}

}

public class SortMountains {
	public static void main(String[] args) {
		ArrayList<Mountains> mon = new ArrayList<Mountains>();
		mon.add(new Mountains("kalash", 5000));
		mon.add(new Mountains("Everest", 11000));
		mon.add(new Mountains("k2", 7000));
		System.out.println("mountains values  " + mon);
		Collections.sort(mon, new SortbyHeight());
		System.out.println("sort by height reverse  " + mon);
		Collections.sort(mon, new SortbyName());
		System.out.println("sort by name   " + mon);
	}

}
