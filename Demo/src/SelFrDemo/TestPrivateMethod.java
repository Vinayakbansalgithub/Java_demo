package SelFrDemo;



interface inter{
	void hello();
	
}

class Base implements inter{
	
	
	public void hello() {
		System.out.println("i am in base hello");
	}
	 void call() {
		System.out.println("base class method is called");
	}
	
}

public class TestPrivateMethod extends Base {
	 void call(TestPrivateMethod obj) {
	
		 obj.call();
		 
	}
public static void main(String[] args) {
	
	
//	Object [] obj= new String[3];
//	
	TestPrivateMethod obj= new TestPrivateMethod();
	obj.call(obj);
	
	TestPrivateMethod opp= new Opposite();
	//opp.print();
	

	
	
	
}

}


class Opposite extends TestPrivateMethod{
	void print() {
		System.out.println("people call me printer");
	}
}
