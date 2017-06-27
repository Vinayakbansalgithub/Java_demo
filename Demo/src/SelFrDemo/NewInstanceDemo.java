package SelFrDemo;

public class NewInstanceDemo {
	NewInstanceDemo(){
		System.out.println("const");
	}
	void print(){
		System.out.println("hello new object");
	}
	static{System.out.println("static");}
	{
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
public static void main(String[] args) throws Exception {
	System.out.println("main");
	Class cls= Class.forName("SelFrDemo.NewInstanceDemo");
	NewInstanceDemo obj=(NewInstanceDemo) cls.newInstance();
	System.out.println(obj);
	obj.print();
}
}
