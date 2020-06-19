package GenricPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Animal<T extends Number>{
	
void eat(){
	
	System.out.println("eat food");
}
	
	
}


public class Dog extends Animal{
	
	
	 static  void genericStatic(List<? super Animal> list){
		
		list.add(new Dog());

		System.out.println(list.getClass().getCanonicalName());

	}
public static void main(String[] args) {
	
	byte b= 127;
	
	Dog obj=new Dog();
	int b1[]={1,2,3,4,5,6,7};
	obj.a(b1);

	System.out.println(Arrays.toString(b1));
	
	List<Animal> list= new ArrayList<>();
	list.add(new Dog());
	list.add(new Dog());

	
	
		genericStatic(list);
	
}
 void a(int[] c) {
	// TODO Auto-generated method stub
	c[2]=9;
	c[5]=9;
}
}
