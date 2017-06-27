package SelFrDemo;

import java.util.Random;

public class RandomGeneratorDemo {
	static String CHAR_LIST = "abcdefg123450hijklmn1567890opqrstuvw12390xyzABCDEFGHI1234567890JKLMNO12390PQRSTUV1234567890WXYZ67890";
	static String STRLIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String NUM_LIST = "1234234567890234567890234567890789023456";
	static String SPL_LIST = "abcde!@#$@%fghijklmnopqrst!@#$!@uvyzAL&^%$EMNUV&*$%^WXYZ";
	Random random = new Random();
public static void main(String[] args) {
	
	RandomGeneratorDemo obj= new RandomGeneratorDemo();
	obj.callrandom(5);
}

private void callrandom(int i) {
	// TODO Auto-generated method stub
	StringBuffer randStr = new StringBuffer();
	for (int j = 0; j < i; j++) {
		int number=random.nextInt(NUM_LIST.length());
		
	//int number=STRLIST.length()-1;
	char ch=NUM_LIST.charAt(number);
		
		randStr.append(ch);
		
	}
	System.out.println(randStr);
	}
	
}
