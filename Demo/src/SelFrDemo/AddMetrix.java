package SelFrDemo;

public class AddMetrix {
public static void main(String[] args) {
	int arr1[][]={{2,3,4},{5,6,7}};
//	System.out.println(arr1.length+arr1[1][2]);
	int arr2[][]={{5,6,7},{2,3,4}};
	int arr[][]=new int[2][3];
	for (int i = 0; i <2; i++) {
		for (int j = 0; j < 3; j++) {
			
			arr[i][j]=arr1[i][j]+arr2[i][j];
		}
	}
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {	System.out.print(arr[i][j]+"  ");}System.out.println();
}
}
}
