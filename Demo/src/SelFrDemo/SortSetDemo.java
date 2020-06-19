package SelFrDemo;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class MyStudent{
	String name;
	int std;
	MyStudent(String name, int std){
		this.name=name;
		this.std=std;
	}
	void setName(String name){
		this.name=name;
		
	}
	void setStd(int std){
		this.std=std;
	}
	String getName(){
		return name;
	}
	int getStd(){
		return std;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + std;
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
		MyStudent other = (MyStudent) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (std != other.std)
			return false;
		return true;
	}
	@Override
	public String toString(){
		return "name "+name+"  class  "+std;
	}
	
	
} 
public class SortSetDemo {
public static void main(String[] args) {
	/*SortedSet<MyStudent> set= new TreeSet(new Comparator<MyStudent>() {
	    @Override
	    public int compare(MyStudent h1, MyStudent h2) {
	        return h1.getName().compareTo(h2.getName());
	    }
	}) ;*/
	SortedSet<MyStudent> set= new TreeSet( Comparator.comparing(MyStudent::getStd).thenComparing(MyStudent::getName));
	set.add(new MyStudent("vinayak",5));
	set.add(new MyStudent("Mehul",7));
	
	set.add(new MyStudent("nandini",3));
	set.add(new MyStudent("Monika",2));

	Iterator itr=set.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
//Object element=	itr.next();
//System.out.println(element.toString());
	}
	
	/*for(MyStudent s:set){
        System.out.println(s);
    }*/

}}
