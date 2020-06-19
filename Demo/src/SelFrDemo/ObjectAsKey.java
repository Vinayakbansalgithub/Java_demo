package SelFrDemo;

import java.util.HashMap;
import java.util.Set;

class Student{
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	int id;
	String name;
	
	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
		id=i;
		name=string;
	}


	int getId(){
		return id;
	}
	
	
	String getName(){
		return name;
	}
	
	void setName(String name){
		this.name=name;
	}
	void setId(int id){
		
		this.id=id;
	}
	
	
	 public String toString(){
	        return "id: "+id+"  name: "+name;
	    }
	
}

public class ObjectAsKey {
public static void main(String[] args) {
	

	ObjectAsKey obj=new  ObjectAsKey();
	 Student s1= new Student(101,"vinayak");
	 Student s2= new Student(102,"nitin");
	 Student s3= new Student(103,"rachna");
	 Student s4= new Student(104,"nasa");
	 Student s5= new Student(101,"vinayak");

	 HashMap<Student, String> map= new  HashMap<Student, String>();
	map.put(s1, "bansal");
	map.put(s2, "kumar"); 
	map.put(s3, "verma");
	map.put(s4, "sunny");
	
	map.put(s5, "jagjeet");
	
	 System.out.println("----values are----");
	 
	/*Iterator itr= map.entrySet().iterator();
	
	while (itr.hasNext()) {
		Map.Entry entry = (Map.Entry) itr.next();
		System.out.println("key is   "+ entry.getKey()+"  value is "+entry.getValue());
	}*/

	 
	Set<Student> set= map.keySet();
for (Student studentkey : set) {
	System.out.println("key is  "  +studentkey+"  value is "+map.get(studentkey));
}
	 
	 
}
	
	
	
}
