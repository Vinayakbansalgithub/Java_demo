package Questions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class TestPr {

	static String find(List<Integer> list) {

		if (list.size() == 1) {
			return "YES";
		}

		int num1;
		int num2;

		boolean even = false;

		int sum = 0;

		for (int i = 0; i < list.size(); ) {

			if (list.size() == 1) {
				return "YES";
			}

			if (list.get(i) % 2 == 0) {
				even = true;
			}

			for (int j = i + 1; j < list.size(); j++) {
				if (list.size() == 1) {
					return "YES";
				}

				if (list.get(j) % 2 == 0 && even) {
					sum = list.get(i) + list.get(j);
					int v1=	list.get(i);
					int v2=	list.get(j);

						list.remove(new Integer(v1));
						list.remove(new Integer(v2));
					list.add(sum);

// remove element from array
				} else if (list.get(j) % 2 == 1 && !even) {
					sum = list.get(i) + list.get(j);
					
				int v1=	list.get(i);
				int v2=	list.get(j);

					list.remove(new Integer(v1));
					list.remove(new Integer(v2));
					list.add(sum);

				}

			}

		}

		return "NO";
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		// Declare the variable
		String a;

		// Read the variable from STDIN
	
		  a= in.nextLine();
//
//		// Output the variable to STDOUT
//		System.out.println("total values " + a);

		 String line= in.nextLine();

		// System.out.println("line values "+line);

		 String[] arr= line.split(" ");

		// System.out.println("total array length "+arr.length);

		// System.out.println(Arrays.toString(arr));

       for(int i=0;i<arr.length;i++){

 list.add(Integer.parseInt(arr[i]));
       }

//		list.add(1);
//		list.add(2);
//		list.add(3);

		System.out.print("00000   " + list);
		find(list);
	}
}
