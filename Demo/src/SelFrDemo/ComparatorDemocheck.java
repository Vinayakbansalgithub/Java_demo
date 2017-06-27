package SelFrDemo;

import java.util.Comparator;

public class ComparatorDemocheck implements Comparator<ComparatorDemocheck> {

	int age;
	String name;
	String city;

	ComparatorDemocheck(int age, String name, String city) {
		this.age = age;
		this.name = name;
		this.city = city;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setCity(String city) {
		this.city = city;
	}

	String getCity() {
		return city;
	}

	@Override
	public int compare(ComparatorDemocheck o1, ComparatorDemocheck o2) {
		// TODO Auto-generated method stub

		return o1.name.compareTo(o2.name);
	}

}
