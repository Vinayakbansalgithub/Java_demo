package java8;
/*interface car{
	default void print(){
		System.out.println("hello i am a car");
	}
}*/
interface Honda{
	default void print(){
		System.out.println("hello i am honda");
	}
}
/*interface Amaze{
	default void carname(){
		System.out.println("hello i am amaze");
	}
}*/

//
public class DefaultMethodclass implements Honda{
 public void print(){
	System.out.println("i am main here");
	 Honda.super.print();
}
	public static void main(String[] args) {
		System.out.println("inside main");
		DefaultMethodclass obj = new DefaultMethodclass();
	obj.print();
	/* public default void print(){
	      Honda.super.print();
	   }*/
}
}
