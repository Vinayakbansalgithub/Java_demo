package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
//  Manacher's Algorithm 
class LongestPalindromicSubstring {
	
	
	static int[] arr;
static String palindromstring;
	static HashSet<Character> set = new HashSet<Character>();
	static int counter;
static int highestindex=0;
static int highest;
	static void longest(char[] str, int length) {
		
		arr = new int[length];
		arr[0] = 1;
		arr[length - 1] = 1;
		for (int i = 1; i < str.length - 1; i++) {
			counter = 1;

			int left = i;
			int right = i;
			while (left > 0 && right < arr.length
					&& str[--left] == str[++right]) {
				counter = counter + 2;

			}

			arr[i] = counter;

		}
		highest=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>highest){
				highest=arr[i];
				highestindex=i;
			}
			
			
		
	}
		
		
		System.out.println(Arrays.toString(arr));
		
		
		
		int point=highest-highestindex;
		
		palindromstring= new String(str);
	
		System.out.println("complete string is "+palindromstring);
		System.out.println(	"  longest palandrome    "+palindromstring.substring(highestindex-point, highestindex+point).toString());
		
	}

	public static void main(String[] args) {
		String str = "abaxabaxabb";

		char[] ch = str.toCharArray();
		 LongestPalindromicSubstring.longest(ch, str.length());
		
	}
}