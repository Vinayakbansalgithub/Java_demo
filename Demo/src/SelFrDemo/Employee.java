package SelFrDemo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 5532986058120048988L;

	public volatile static Employee emp;

	public String name;
	public transient String company;
	public transient int SalaryInLac;

	private Employee(String name, String company, int salaryInLac) {
		if (emp != null) {
			throw new Error("Don't want any more instances");
		}

		this.name = name;
		this.SalaryInLac = salaryInLac;
		this.company = company;

	}

	/*
	 * private Object readResolve() throws ObjectStreamException { return emp; }
	 */

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public static Employee getInstance() {
		/*
		 * if(emp!= null){ throw new Error("Don't want any more instances"); }
		 */
		if (emp == null) // single check
		{
			synchronized (Employee.class) {

				if (emp == null) // double checking
					emp = new Employee("vinayak", "puresoftware", 3);

			}
		}

		return emp;
	}

}
