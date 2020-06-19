package SelFrDemo;

public class SelectionSortAlgo {

	// average complexity of selection sort is n^2

	static void sort(int arr[]) {

		int minloc = 0, minvalue , temp, itr = 1;
		for (int k = 0; k < arr.length; k++) {
			for (int i = k; i < arr.length; i++) {
				if (arr[i] < arr[minloc]) {
					temp = arr[i];
					arr[i] = arr[minloc];
					arr[minloc] = temp;

				}
			}
			System.out
					.println("min value after  " + itr + " is " + arr[minloc]);
			itr++;
			minloc++;

		}
		for (int k = 0; k < arr.length; k++)
			System.out.println("value after sorting  " + arr[k]);
	}

	public static void main(String[] args) {
		int arr[] = { 11, 27, 2, 12, 1, 4, 13, 99, 5, 31, 65, 8 };
		sort(arr);

		/*
		 * int minloc=0,minvalue=0,temp,itr=1; int arr[] = { 11, 27, 2, 12,1,
		 * 4,13,99,5,31,65,8 };
		 * 
		 * for(int k=0;k<arr.length;k++){ for(int i=k;i<arr.length;i++){
		 * if(arr[i]<arr[minloc]){ temp=arr[i]; arr[i]=arr[minloc];
		 * arr[minloc]=temp;
		 * 
		 * } } System.out.println("min value after  " +itr+" is " +arr[minloc]);
		 * itr++; minloc++;
		 * 
		 * } for (int k = 0; k < arr.length; k++)
		 * System.out.println("value after sorting  " + arr[k]);
		 */
	}
}
