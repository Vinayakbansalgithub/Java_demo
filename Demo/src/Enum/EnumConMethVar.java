package Enum;
enum enums{
	A,b,c;
	int i;
	enums(){
		System.out.println("enum constructor");
	}
	void print(){
		System.out.println("print method");
	}
}
public class EnumConMethVar {
	public static void main(String[] args) {
		enums e= enums.A;
		System.out.println(e.i);
		e.print();
	
	}

}
