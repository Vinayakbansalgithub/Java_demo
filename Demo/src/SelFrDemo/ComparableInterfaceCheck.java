package SelFrDemo;

public class ComparableInterfaceCheck implements Comparable {

	int age;
	String name;
	String city;
	
	
	ComparableInterfaceCheck(int age,String name,String city){
		this.age= age;
		this.name=name;
		this.city=city;
	}
	
	void setAge(int age){
		this.age= age;
	}
int getAge(){
	return age;
}

void setName(String name){
	this.name= name;
}
String getName(){
return name;
}


void setCity(String city){
	this.city= city;
}
String getCity(){
return  city;
}

	
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		   int compareage=((ComparableInterfaceCheck)o).getAge();
	        /* For Ascending order*/
	        return this.age-compareage;
		

	}
	
	
	@Override
    public String toString() {
        return "[ age=" + age + ", name=" + name + ", city=" + city + "]";
    }

}
