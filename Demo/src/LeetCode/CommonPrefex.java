<<<<<<< HEAD
package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

import com.googlecode.javacv.FrameGrabber.Array;

public class CommonPrefex {
	static String[] arrayall = new  String[10];
	static char[] arrone;
	
	
static HashMap<String, Integer> map= new HashMap<String, Integer>();
	
	
	static void commonPrefix(String[] arr) {
		StringBuffer buffer = new StringBuffer();

		int index = 0;
			String one = arr[0];
			arrone = one.toCharArray();
		
			for (int j =  1; j < arr.length; j++) {
				
				int count = 0;

				char[] arrtwo=arr[j].toCharArray();
				while ((count < arrtwo.length) && (count < arrone.length) && arrone[count] == arrtwo[count]) {

					if (arrone[count] != arrtwo[count]) {
						System.out.println("issue");
					}

					buffer.append(arrone[count]);
					count++;

				}
				arrone=buffer.toString().toCharArray();
				
				buffer.delete(0, buffer.length());
				
				/*char[] arrtwo = arr[j].toCharArray();

				int count = 0;

				while ((count < arrtwo.length) && (count < arrone.length)
						&& arrone[count] == arrtwo[count]) {

					if (arrone[count] != arrtwo[count]) {
						System.out.println("issue");
					}

					buffer.append(arrone[count]);
					count++;

				}
				System.out.println("  comparing  " + buffer.toString());
				arrayall[index] = buffer.toString();
				index++;
				buffer.delete(0, buffer.length());*/
			}

		

		System.out.println("common prefix   "+Arrays.toString(arrone));
		
		
		
		
		
	

	}

	public static void main(String... a) {
		String arr[] = { "vinayak", "vinayakbansal", "vinaya", "vinay" };

		
		
		
		 commonPrefix(arr);

	}

}
=======
package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

import com.googlecode.javacv.FrameGrabber.Array;

public class CommonPrefex {
	static String[] arrayall = new  String[10];
	static char[] arrone;
	
	
static HashMap<String, Integer> map= new HashMap<String, Integer>();
	
	
	static void commonPrefix(String[] arr) {
		StringBuffer buffer = new StringBuffer();

		int index = 0;
			String one = arr[0];
			arrone = one.toCharArray();
		
			for (int j =  1; j < arr.length; j++) {
				
				int count = 0;

				char[] arrtwo=arr[j].toCharArray();
				while ((count < arrtwo.length) && (count < arrone.length) && arrone[count] == arrtwo[count]) {

					if (arrone[count] != arrtwo[count]) {
						System.out.println("issue");
					}

					buffer.append(arrone[count]);
					count++;

				}
				arrone=buffer.toString().toCharArray();
				
				buffer.delete(0, buffer.length());
				
				/*char[] arrtwo = arr[j].toCharArray();

				int count = 0;

				while ((count < arrtwo.length) && (count < arrone.length)
						&& arrone[count] == arrtwo[count]) {

					if (arrone[count] != arrtwo[count]) {
						System.out.println("issue");
					}

					buffer.append(arrone[count]);
					count++;

				}
				System.out.println("  comparing  " + buffer.toString());
				arrayall[index] = buffer.toString();
				index++;
				buffer.delete(0, buffer.length());*/
			}

		

		System.out.println("common prefix   "+Arrays.toString(arrone));
		
		
		
		
		
	

	}

	public static void main(String... a) {
		String arr[] = { "vinayak", "vinayakbansal", "vinaya", "vinay" };

		
		
		
		 commonPrefix(arr);

	}

}
>>>>>>> branch 'master' of https://github.com/Vinayakbansalgithub/Java_demo.git
