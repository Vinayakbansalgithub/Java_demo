package SelFrDemo;

import java.util.HashSet;
import java.util.Set;

public class HashCodeEqualsMain {

	// if two objects are equal there hashcode will be same while viseaversa is
	// not true

	public static void main(String[] args) {
		HashCodeEqualsEmployee e1 = new HashCodeEqualsEmployee();
		HashCodeEqualsEmployee e2 = new HashCodeEqualsEmployee();
		e1.setId(100);
		e1.setFname("vinayak");
		e1.setLname("bansal");
		e1.setCity("firozabad");
		e2.setId(100);
		e2.setFname("nitin");
		e2.setLname("kumar");
		e2.setCity("Delhi");
		System.out.println("hashcode of e1 " + e1.hashCode());
		System.out.println("hashcode of e2 " + e2.hashCode());

		System.out.println(e1.equals(e2));
		Set<HashCodeEqualsEmployee> employees = new HashSet<HashCodeEqualsEmployee>();
		employees.add(e1);
		employees.add(e2);

		// Prints two objects
		System.out.println(employees);

	}
}
