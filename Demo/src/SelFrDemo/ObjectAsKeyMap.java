package SelFrDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class MyEmployee {
	int id;
	String name;

	public MyEmployee(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "id is  " + id + "  name is  " + name;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEmployee other = (MyEmployee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class ObjectAsKeyMap {

	static void display(HashMap<MyEmployee, String> hm) {
		// TODO Auto-generated method stub

Iterator itr=hm.entrySet().iterator();
		
		while(itr.hasNext()){
			
	Map.Entry e=(Map.Entry)itr.next();		
		
		System.out.println("key is "+e.getKey()+"   value is "+e.getValue());
		}

	}

	public static void main(String args[]) {
		System.out.println("object as key ");
		MyEmployee obj1 = new MyEmployee(1221, "vinayak");
		MyEmployee obj2 = new MyEmployee(1222, "nitin");
		MyEmployee obj3 = new MyEmployee(1223, "harsh");

		HashMap<MyEmployee, String> hm = new HashMap<MyEmployee, String>();
		hm.put(obj1, "bansal");
		hm.put(obj2, "kumar");
		hm.put(obj3, "rai");
		display(hm);

	}

}
