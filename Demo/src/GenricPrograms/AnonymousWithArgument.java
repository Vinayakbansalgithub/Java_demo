package GenricPrograms;
interface myInterface{
	void myintefaceMethod();
	
}

class myClass{
	void myclassMethod(myInterface i)
	{
		
	}
	
}
public class AnonymousWithArgument {
	
	public static void main(String[] args) {
		myClass my= new myClass();
				my.myclassMethod(
				new myInterface(){
					public void myintefaceMethod(){
						System.out.println("jedl");
					}
				}
				);
	}
	

}
