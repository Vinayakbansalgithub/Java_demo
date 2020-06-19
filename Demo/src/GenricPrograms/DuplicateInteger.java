package GenricPrograms;

import java.util.Arrays;

public class DuplicateInteger {
	
	public static int[] removeDuplicates(int []s){
        int result[] = new int[s.length], j=0;
        for (int i : s) {
            if(!isExists(result, i))
                result[j++] = i;
        }
        return result;
    }
    private static boolean isExists(int[] array, int value){
        for (int i : array) {
            if(i==value)
                return true;
        }
        return false;
    }
public static void main(String[] args) {
	int arr[]= {985, 521, 975, 831, 479, 861,831,985};
	removeDuplicates(arr);
	
	
	
}
}
