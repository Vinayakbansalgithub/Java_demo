package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Person {
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class CollectionSortExample {

	public static void main(String[] args) {

		Person p1 = new Person("vinayak", 27);
		Person p2 = new Person("Anshul", 28);
		Person p3 = new Person("KK", 29);

		List<Person> list = new ArrayList<>();

		list.add(p1);
		list.add(p2);
		list.add(p3);

		Collections.sort(list, new Comparator<Person>() {

			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("=================");
		Collections.sort(list,

				((pp1, pp2) -> pp2.getName().compareTo(pp1.getName()))

		);

		itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("=================");
		Collections.sort(list,

				((pp1, pp2) -> pp2.getAge() - pp1.getAge())

		);

		itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
