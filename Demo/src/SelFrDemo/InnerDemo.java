package SelFrDemo;
class OuterClass
{
    class InnerClass
    {
    	
    	
        int i;     //Non-static field of InnerClass
 
        static final int j = 10;  //static and final field of InnerClass
 
        void methodOne()
        {
            System.out.println("Non-static method of InnerClass");
        }
    }
}
public class InnerDemo {
    public static void main(String args[])
    {
        OuterClass outer = new OuterClass();  //creating an instance of OuterClass
 
        OuterClass.InnerClass inner = outer.new InnerClass();  //creating an instance of InnerClass
 
        System.out.println(inner.i);    //accessing non-static field of InnerClass
 
        System.out.println(OuterClass.InnerClass.j);    //static field can be accessed directly through class name
 
        inner.methodOne();     //accessing non-static method of InnerClass
    }
}
