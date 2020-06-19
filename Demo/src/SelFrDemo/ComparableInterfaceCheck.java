package SelFrDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java8.ForEachIterator;

public class ComparableInterfaceCheck implements Comparable {

	int age;
	String name;
	String city;

	ComparableInterfaceCheck(int age, String name, String city) {
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
	public int compareTo(Object o) {
		// TODO Auto-generated method stub

		int compareage = ((ComparableInterfaceCheck) o).getAge();
		/* For Ascending order */
		return this.age - compareage;

	}

	@Override
	public String toString() {
		return "[ age=" + age + ", name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		ComparableInterfaceCheck onj1 = new ComparableInterfaceCheck(10, "gautam", "mumbai");
		ComparableInterfaceCheck onj2 = new ComparableInterfaceCheck(1, "ishu", "pune");
		ComparableInterfaceCheck onj3 = new ComparableInterfaceCheck(10, "vinayak", "Delhi");

		List<ComparableInterfaceCheck> list = new ArrayList();
		list.add(onj1);
		list.add(onj2);
		list.add(onj3);

		for (ComparableInterfaceCheck obj : list) {
			System.out.println(obj);
		}
		
		Collections.sort(list);
		
		
		for (ComparableInterfaceCheck obj : list) {
			System.out.println(obj);
		}
	}
}
