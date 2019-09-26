package Recurssion;

public class IsArraySorted {
	
	static boolean flag = true;

	private static boolean isSort(int index, int[] arr) {

		
	
		
		if (index > 0 && arr[index] < arr[index - 1]) {
			return false;
		}

	if (index > 0)
			flag = isSort(index - 1, arr);

		return flag;
	}
	
	 static boolean isSortTwo(int index, int[] arr) {
		// TODO Auto-generated method stub
		 
			if(index==arr.length-1) {
				return true;
			}
			if (arr[index] > arr[index + 1]) {
				return false;
			}else {
				flag=	isSortTwo(index+1,  arr);
			}

		 
		 
		return flag;
	}
public static void main(String[] args) {
	int arrsorted[]= {1,2,3,4,5};
	int arrUnsorted[]= {11,2,13,14,1500,111};

//System.out.println(isSort(arrsorted.length-1,arrsorted));

System.out.println(isSortTwo(0,arrUnsorted));

}


}
