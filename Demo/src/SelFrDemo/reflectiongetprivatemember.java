package SelFrDemo;

import java.lang.reflect.Field;

class Reflectioncheck{
	private int x=10;
	
	
}

public class reflectiongetprivatemember {
public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	
	Reflectioncheck refobj= new Reflectioncheck();
	
	Field value=Reflectioncheck.class.getDeclaredField("x");
	value.setAccessible(true);
	
	
	
	Object data= value.get(refobj);

	System.out.println(data);
	
	
}
}
