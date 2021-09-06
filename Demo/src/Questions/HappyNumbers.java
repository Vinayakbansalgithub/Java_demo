package Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


// 202. Happy Number

public class HappyNumbers {

//	static boolean find(int num) {
//
//		HashSet<Integer> set = new HashSet<>();
//
//		while (num != 1) {
//
//			int sum = 0;
//			int temp = num;
//			while (temp != 0) {
//				sum += (temp % 10)*(temp % 10);
//				temp /= 10;
//
//			}
//			num = sum;
//			
//			
//			if(!set.contains(num)) {
//				set.add(num);
//			}else
//				return false;
//			
//
//		}
//		
//		return true;
//
//	}
//	
	
	static String find(List<Integer> list) {

		if (list.size() == 1) {
			return "YES";
		}

		int num1;
		int num2;

		boolean even = false;

		int sum = 0;

		for (int i = 0; i < list.size(); i++) {

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
					list.remove(i);
					list.remove(j);
					list.add(sum);

// remove element from array
				} else if (list.get(j) % 2 == 1 && !even) {
					sum = list.get(i) + list.get(j);
					list.remove(i);
					list.remove(j);
					list.add(sum);

				}

			}

		}

		return "NO";
	}

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);

		System.out.print("00000   " + list);
		find(list);
//		
//		int num = 18;
//		boolean res=find(num);
//		System.out.println(res);
	}
}
