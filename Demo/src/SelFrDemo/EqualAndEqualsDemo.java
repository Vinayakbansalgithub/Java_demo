package SelFrDemo;

public class EqualAndEqualsDemo {
	 public static void main(String[] args) {
		String s1= new String("vinayak");
		String s2= new String("vinayak");
		String 	s3="vinayak";
		String s4="vinayak";
		String st=s4.substring(8);
		System.out.println("njfjh"+st+"jhdfhh");
		System.out.println("----------Demo---------");

		System.out.println("s1==s2"+s1==s2); //false
		System.out.println("needed value");
		System.out.println(s1.equals(s2) && s1.hashCode()== s2.hashCode()); // true
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		System.out.println("s3 equals s4"+s3.equals(s4)); // true
		System.out.println("s3 == s4"+s3==s4);		//false
		//s1="vinayak";
		
		s1=s2;
		System.out.println("after equal");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2); // true
		System.out.println(s1);
		System.out.println(s1.equals(s2)); //true
		
		Object obj1= new Object();
		Object obj2= new Object();
		System.out.println(obj1==obj2); // false
		System.out.println("objce t case equal "+obj1.equals(obj2)); // flase
		obj1=obj2;
		System.out.println(obj1==obj2); //true
		System.out.println(obj1.equals(obj2)); //true
		
		
		
		
	}

}
