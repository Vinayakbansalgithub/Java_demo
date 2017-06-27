package SelFrDemo;

import java.util.Arrays;

public class ArrayListImpl {
	Object[] ObjSize;
	int actSize = 0;

	ArrayListImpl() {
		ObjSize = new Object[10];
	}

	public static void main(String a[]) {
		
		System.out.println("return jQuery.active");

		ArrayListImpl mal = new ArrayListImpl();
		mal.add(new Integer(2));
		mal.add(new Integer(4));
		mal.add(new Integer(56));
		mal.add(new Integer(21));
		mal.add(new Integer(27));
		mal.add(new Integer(4));
	
		for (int i = 0; i < mal.size(); i++) {
			System.out.println("value stored in arraylist is" + mal.get(i));
		}

		mal.remove(2);
		for (int i = 0; i < mal.size(); i++) {
			System.out.println("value stored in arraylist is" + mal.get(i));
		}
		mal.remove(2);
		for (int i = 0; i < mal.size(); i++) {
			System.out.println("value stored in arraylist is" + mal.get(i));
		}
		mal.remove(2);
		for (int i = 0; i < mal.size(); i++) {
			System.out.println("value stored in arraylist is" + mal.get(i));
		}

		//mal.remove(2);

		for (int i = 0; i < mal.size(); i++) {
			System.out.println("value stored in arraylist is" + mal.get(i));
		}
	}

	void remove(int Index) {
		if (Index < actSize) {
			System.out.println("act size is " + actSize);
			for (int i = Index; i < actSize; i++) {
				ObjSize[Index] = ObjSize[Index + 1];
				Index++;
			}

		} else
			throw new ArrayIndexOutOfBoundsException();
		actSize--;
	}

	Object get(int i) {

		return ObjSize[i];
	}

	int size() {
		// TODO Auto-generated method stub
		return ObjSize.length;
	}

	private void add(Object obj) {
		if (ObjSize.length - actSize <= 5) {
			increaseSize();
		} else {

			ObjSize[actSize++] = obj;

		}
	}

	void increaseSize() {
		ObjSize = Arrays.copyOf(ObjSize,ObjSize.length+ (ObjSize.length / 2));
		System.out.println("new size of array is  " + ObjSize);
	}
}