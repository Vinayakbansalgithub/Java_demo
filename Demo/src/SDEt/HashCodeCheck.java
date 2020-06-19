package SDEt;

import SelFrDemo.Employee;


class employee{
	
	int empid;
	String name;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	employee(int empid,String name){
		
		this.empid=empid;
		this.name=name;
		
	}
	
	@Override
	public int hashCode() {
		return empid;
	}
	@Override
	public boolean equals(Object obj) {

		System.out.println(this+"----------"+obj);

		if (this == obj){
			
			return true;
		}
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		if (empid != other.empid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
}


public class HashCodeCheck {
public static void main(String[] args) {
	
	
	
	employee e1= new employee(11,"vinayak");
	employee e3= new employee(11,"vinayakk");

	employee e2= new employee(12,"mehul");
	
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	System.out.println(e3.hashCode());

	System.out.println(e1.equals(e2));
	System.out.println(e2.equals(e3));
	System.out.println(e1.equals(e3));

	

	
	
}
}
