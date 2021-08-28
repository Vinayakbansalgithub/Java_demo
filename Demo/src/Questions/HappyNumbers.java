package Questions;

import java.util.HashSet;


// 202. Happy Number

public class HappyNumbers {

	static boolean find(int num) {

		HashSet<Integer> set = new HashSet<>();

		while (num != 1) {

			int sum = 0;
			int temp = num;
			while (temp != 0) {
				sum += (temp % 10)*(temp % 10);
				temp /= 10;

			}
			num = sum;
			
			
			if(!set.contains(num)) {
				set.add(num);
			}else
				return false;
			

		}
		
		return true;

	}

	public static void main(String[] args) {
		
		String s="NUsjwCjctF​​​​​​​\n"
				+ "\n"
				+ "Rita Price_update\n"
				+ "Farmers Insurance\n"
				+ "26856 Hwy 189\n"
				+ "Lake Arrowhead, CA 92352\n"
				+ "License Number: 0544472\n"
				+ "909-337-2518 (Office)\n"
				+ "909-336-6989 (Fax)\n"
				+ "rprice@FarmersagentUAT.com\n"
				+ "http://www.farmersagent.com/rprice ";
		s="";
		
		s=s.replace("\n", "");
		s=s.trim();
		String t="NUsjwCjctF​​​​​​​Rita Price_updateFarmers Insurance26856 Hwy 189Lake Arrowhead, CA 92352License Number: 0544472909-337-2518 (Office)909-336-6989 (Fax)rprice@FarmersagentUAT.com​​​​​​​http://www.farmersagent.com/rprice  ";
		t=t.replace("\n", "");
		t=t.trim();
		
		System.out.println(s);
		System.out.println(t);
		
		
		int num = 18;
		boolean res=find(num);
		System.out.println(res);
	}
}
