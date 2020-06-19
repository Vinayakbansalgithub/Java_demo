package SelFrDemo;

public class ClassCastCheck  {
static int a=4;

	void go(){
		
		a=a+4;
		
	}
    public static void main(String args[]) {

    	ClassCastCheck obj=  new ClassCastCheck();
    obj.go();
    System.out.println(obj.a);
    }
}