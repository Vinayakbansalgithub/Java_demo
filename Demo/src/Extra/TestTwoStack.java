package Extra;

public class TestTwoStack {

	static int arr[];
	static int top1;
	static int top2;

	TestTwoStack(int size) {
		arr = new int[size];
		top1 = -1;
		top2 = size;
	}

	void push1(int value) {
		if(top1+1==top2) {
			System.out.println("array is full 1");
			return;
		}
		arr[top1 + 1] = value;
		top1 = top1 + 1;
	}

	void push2(int value) {
		if(top2-1==top1) {
			System.out.println("array is full 2");
			return;
		}
		arr[top2 - 1] = value;
		top2 = top2 - 1;
	}

	
	int size1() {
		return top1+1;
	}
	int size2() {
		return arr.length-top2;
	}
	
	
	int top1() {
		if(top1==-1) {
			System.out.println("stack underflow");
		}else {
			return arr[top1];
			
			
		}
		return -1;
	}
	
	int top2() {
		if(top2==arr.length) {
			System.out.println("stack underflow");
		}else {
			return arr[top2];
			
			
		}
		return -1;
	}
	
	int pop1() {
		if(top1==-1) {
			System.out.println("stack underflow");
			return -1;
		}else {
			int value= arr[top1];
			top1=top1-1;
			return value;
			
		}
	}
	
	
	int pop2() {
		if(top1==arr.length) {
			System.out.println("stack underflow");
			return -1;
		}else {
			int value= arr[top2];
			top2=top2+1;
			return value;
			
		}
	}
	
	public static void main(String[] args) {

		TestTwoStack obj = new TestTwoStack(6);
//		obj.push1(4);
//		obj.push2(5);
		
		

		obj.push1(5);
		obj.push2(4);
		obj.push1(4);
		obj.push2(5);
		obj.push2(9);
		obj.push1(0);
		System.out.println(obj.size1());
		System.out.println(obj.size2());
		System.out.println(obj.top1());
		System.out.println(obj.top2());
		System.out.println(obj.pop1());
		System.out.println(obj.pop2());
		System.out.println(obj.size1());
		System.out.println(obj.size2());
	}

}
