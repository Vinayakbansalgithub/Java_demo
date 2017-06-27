package SelFrDemo;

 interface MyInterfacedemo{
	
	 class MyInnerClass
	{
		void display(){
			System.out.println("we are in inner class");
		}
		
	}
}



public class InterfacehavingStaticClass implements MyInterfacedemo
{

	public static void main(String[] args) {
		InterfacehavingStaticClass obj = new InterfacehavingStaticClass();
		MyInterfacedemo.MyInnerClass ref= new MyInterfacedemo.MyInnerClass();
		ref.display();
		
		
		
	}
	
}
