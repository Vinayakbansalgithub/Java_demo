package SelFrDemo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Reflectioncheck{
	private int x=10;
	
	
}

public class reflectiongetprivatemember {
	
	
	void print(int i){
		
		System.out.println("print");
	}
	
	void get(){}
	
public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
	
	Reflectioncheck refobj= new Reflectioncheck();
	
	Field value=Reflectioncheck.class.getDeclaredField("x");
	value.setAccessible(true);
	
	/*Method method =refobj.getClass().getMethod("print",null);

	method.invoke("print", null);*/

	
	
	Object data= value.get(refobj);

	System.out.println(data);
	
	
	Class cls = Class.forName("SelFrDemo.reflectiongetprivatemember");
	Method method = null;
	method = ((Class) cls).getMethod("print", null);

		
		method.invoke(10,null);	
	
}
}
