package Matrix;

public class Matrix90Degree {
	 
	static int arrNew[][]=new int[3][3];
	static int temp=0;
	static void nintyRotate(int[][] arr) {

		 for (int i = 2; i >= 0; i--) {
			 for (int j = 0; j < 3; j++) {
				
				 
				 arrNew[temp][j]=arr[j][i];
				 
				 System.out.print(arrNew[temp][j]+"   ");
			}temp++;
System.out.println();

		 
		 }		 
		 
		}
	
public static void main(String[] args) {
	int arr[][]={{11,3,45},{1,22,51},{8,3,9},{18,31,19}};
	System.out.println("][]]]]]]]]]]]]]]]]]]]]");
	nintyRotate(arr);
	System.out.println("[[[[[[[[[[[[[[[[[[");
}


}
