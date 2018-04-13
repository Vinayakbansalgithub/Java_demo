package CollectionFramework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class Data{
	int id;
	String name;
	
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
		Data other = (Data) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	Data(int id , String name){
		
		
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return name+"   "+id;
		
		
	}
	
}
public class HashCodeCheck {
	
	
	
	
public static void main(String[] args) throws ParseException {
	
	String s="20/12/2017";
	
	
	int h=6;
	Integer ii=Integer.valueOf(h);
	ii.intValue();
	
	SimpleDateFormat sf= new SimpleDateFormat("dd/MM/yy");
	
	System.out.println(sf.parse(s));
	
	outer:
	for(int i=0;i<5;i++)
	{
		continue outer;
		System.out.println("1234");
	}
	
	
	
	
	Data d1= new Data(1,"vinayak");
	Data d2= new Data(2,"mehul");
	Data d3= new Data(1,"vinayka");

	System.out.println(d1.hashCode());
	System.out.println(d2.hashCode());
	System.out.println(d3.hashCode());

	HashMap<Data, String> map= new HashMap<>();
	
	System.out.println(map.getClass());
	
	
	map.put(d1, "value1");
	map.put(d2, "value2");
	map.put(d3, "value3");

	
	
	Iterator itr=map.entrySet().iterator();
	while (itr.hasNext()) {
	Map.Entry	entry=(Map.Entry)itr.next();
	
	System.out.println(entry.getKey()+"   "+entry.getValue());
	}


}}
