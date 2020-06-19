package SelFrDemo;

public class ArrImpcheck {
	
	Object[] ref;
	
	public ArrImpcheck() {
		// TODO Auto-generated constructor stub
	ref=new Object[10];
	}
	
	int size=0;
public static void main(String[] args) {
	ArrImpcheck arr= new ArrImpcheck();
	arr.add(new Integer(10));
	arr.add(new Integer(11));
	arr.add(new Integer(12));
	arr.add(new Integer(13));
	arr.add(new Integer(14));
	
	
	for (int i = 0; i < arr.size(); i++) {
		System.out.println("value stored in arraylist is" + arr.get(i));
	}
}

  int size() {
	// TODO Auto-generated method stub
	return 5;
}

Object get(int i) {
	// TODO Auto-generated method stub
	return  ref[i];
}

private void add(Object any) {
	// TODO Auto-generated method stub
	ref[size++]=any;
}
}
