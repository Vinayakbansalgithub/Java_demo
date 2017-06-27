package SelFrDemo;

interface Demoint{
	void print();
	
}

public class annodemo {
public static void main(String[] args) {
	Demoint dd= new Demoint(){
		public void print(){
			System.out.println("egffe");
		}
		
	};
	dd.print();
}
}
