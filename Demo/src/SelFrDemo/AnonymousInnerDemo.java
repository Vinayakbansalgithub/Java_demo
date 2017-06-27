package SelFrDemo;

 interface MyInterface
{
abstract String fun();	
}

public class AnonymousInnerDemo {
	
	void disp(MyInterface m)
	{
		System.out.println("anonymous demo");
		System.out.println("value of m is  "+m);
		
		System.out.println(m.fun());
	}
	public static void main(String[] args) {
	
		AnonymousInnerDemo ann= new AnonymousInnerDemo();
		ann.disp(new MyInterface() {
			
			@Override
			public String fun() {
				// TODO Auto-generated method stub
				return "vinayak";
			}
		});

	}
	

}
