package java8;

interface Anno {
	void print();
}

public class AnnonimusDemo {
	public static void main(String[] args) {
		Anno obj = new Anno() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("hello vinayak");
			}
		};
		obj.print();
	}
}
