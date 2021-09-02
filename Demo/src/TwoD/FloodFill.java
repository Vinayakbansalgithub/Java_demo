package TwoD;

public class FloodFill {
public static void main(String[] args) {
	
	
	int arr[][]= {{1,1,1},{1,1,0},{1,0,1}};
	
	
	find(arr);
}

private static void find(int[][] arr) {
	// TODO Auto-generated method stub
	
	
	
	
	floodfillUtilDFS(arr, 1,1,arr[1][1],2 );
	
	for (int i = 0; i < arr.length; i++) {
		for(int j=0;j<arr[i].length;j++) {
			
			System.out.println(arr[i][j]);
		}
	}
	
	
}

private static void floodfillUtilDFS(int[][] arr, int r, int c, int oldColor, int newColor) {
	// TODO Auto-generated method stub
	
	
	
	if(r<0||r>arr.length-1||c<0||c>arr.length-1||arr[r][c]!=oldColor)
		return;
	
	
	arr[r][c]=newColor;
	
	
	floodfillUtilDFS(arr, r-1, c, oldColor, newColor); //t
	floodfillUtilDFS(arr, r, c+1, oldColor, newColor); // r
	floodfillUtilDFS(arr, r+1, c, oldColor, newColor); // d
	floodfillUtilDFS(arr, r, c-1, oldColor, newColor); //

	
}
}
