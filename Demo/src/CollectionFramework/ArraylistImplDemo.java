package CollectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class ArraylistImplDemo<T> {
	T t;
	static Object[] obj= new Object[10];
	int count=0;

 void add(T t) {
	// TODO Auto-generated method stub
	 if(count>obj.length/2)
		 IncreaseSize();
	obj[count]=t;
	count++;
}
	
 void IncreaseSize(){
	
	 obj = Arrays.copyOf(obj, obj.length*2);
	
 }
 public Object get(int index) {
		// TODO Auto-generated method stub
		return obj[index];
	}

  void remove(int index) {
		// TODO Auto-generated method stub
	 for (int i = index; i <= count-1; i++) {
		 obj[i]=obj[i+1];
	}
		obj[count]=null;
	}
 
  
   void addAll(int index, T t) {
		// TODO Auto-generated method stub
	   for (int j =  count-1; j >= index; j--) {
		obj[j+1]=obj[j];
	}
		obj[index]=t;
	}
public static void main(String[] args) {
	
	ArraylistImplDemo<Integer> arr= new ArraylistImplDemo<Integer>();
	arr.add(10);
	arr.add(20);
	arr.add(30);
	arr.add(40);
	arr.add(50);
	arr.add(60);
	arr.add(10);
	arr.add(20);
	arr.add(30);
	arr.add(40);
	arr.add(50);
	arr.add(60);
	//arr.add("ggggg");
	arr.add(40);
	arr.add(50);
	arr.addAll(2,90);
	
	arr.remove(3);
	for (int i = 0; i < obj.length; i++) {
		System.out.println(arr.get(i));
	}


}









}
