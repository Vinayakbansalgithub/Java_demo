package SelFrDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallStaticMethodFromMethodClassInvoke {
	
	
	public static String methodname="print";;
	static Method met[];
	public static void print(){
		System.out.println("i m here to print your values");
	}
	
public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	CallStaticMethodFromMethodClassInvoke obj= new CallStaticMethodFromMethodClassInvoke();
	met=obj.getClass().getDeclaredMethods();
	for (int i = 0; i < met.length; i++) {
		System.out.println(met[i]);
	
	Class cls = null;
	Method method;
	
		cls = Class.forName("SelFrDemo.CallStaticMethodFromMethodClassInvoke");
	
	
	method=	((Class) cls).getDeclaredMethod(methodname, null);
	System.out.println(method);
	
	method.invoke(methodname, null);
}
	}
}
