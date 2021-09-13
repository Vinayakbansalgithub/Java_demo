package GeneralTopics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
	public static void main(String[] args) {
		ComparableInterfaceCheck onj1 = new ComparableInterfaceCheck(10, "gautam", "mumbai");
		ComparableInterfaceCheck onj2 = new ComparableInterfaceCheck(1, "ishu", "pune");
		ComparableInterfaceCheck onj3 = new ComparableInterfaceCheck(10, "vinayak", "Delhi");

		List<ComparableInterfaceCheck> list = new ArrayList();
		list.add(onj1);
		list.add(onj2);
		list.add(onj3);
	
	
	
	}

}
