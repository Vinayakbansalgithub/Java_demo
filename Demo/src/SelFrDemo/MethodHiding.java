package SelFrDemo;

class Animal {
	public void fun() {
		System.out.println("Animal");
	}
}

public class MethodHiding extends Animal {
	public void fun() {
		System.out.println("MethodHiding");
	}
/*public static void main(String[] args) {
	
new MethodHiding().fun();
	
Animal animal= new Animal();
animal.fun();
	

}*/
}

