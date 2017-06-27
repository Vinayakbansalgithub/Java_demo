package Matrix;

public class MatrixSprialForm {
	static int sr=0;
	static int er=5;
	static int sc=0;
	static int ec=3;
	int itr=1;
	 static void sprial(int[][] arr, int row, int column) {
		// TODO Auto-generated method stub
		while (sr<er &&sc<ec) {
			for (int i = sc; i <=ec; i++) {
				System.out.println(arr[sr][i]);
			}
			sr++;
			//System.out.println("start row  "+sr);
			for (int j = sr; j <=er; j++) {
				System.out.println(arr[j][ec]);
			}
			ec--;
			//System.out.println("end column  "+ec);

			for (int k = ec; k >=sc; k--) {
				System.out.println(arr[er][k]);
			}
			er--;
			//System.out.println("end row  "+er);

			for (int l = er; l >=sr; l--) {
				System.out.println(arr[l][sc]);
			}
			sc++;
			//System.out.println("start row  "+sr);

			
		}
		 
		 
	} 
	
public static void main(String[] args) {
	int arr[][]={{11,3,45,666},{1,22,51,29},{8,3,9,17},{47,49,32,1},{32,79,12,18},{52,454,5,10}};
	sprial(arr,6,4);
	//
	
}


}
 