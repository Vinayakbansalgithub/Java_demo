package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


class Study{
	String name;
	int std;
	Study(String name, int std){
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
		Study other = (Study) obj;
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
public class PriorityQueueDemo {
public static void main(String[] args) {
	Queue<Study> queue= new PriorityQueue(Comparator.comparing(Study::getStd));
	queue.add(new Study("vinayak",5));
	queue.add(new Study("Mehul",7));
	
	queue.add(new Study("nandini",3));
	queue.add(new Study("Monika",2));
	 System.out.println("Priority  queue: " + queue);
}
}
