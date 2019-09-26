package ArrayQuestions;

public class MergerTwoSortedArray {
	

private static void merge(int[] a1, int[] a2) {
	// TODO Auto-generated method stub
	
	
	int mergedArr[]= new int[a1.length+a2.length];
	int i = 0,j=0,k=0;
	
	while(i<a1.length && j<a2.length) {
		
		if(a1[i]>a2[j]) {
			mergedArr[k]=a2[j];	
			j++;
			
			
		}else {
			mergedArr[k]=a1[i];	
			i++;
		}
		k++;
		
		
		
	}
	
	
	while(i<a1.length){
		mergedArr[k]=a1[i];	
		i++;
		k++;
	}
	while(j<a2.length){
		mergedArr[k]=a2[j];	
		j++;
		k++;
	}
	for (int z = 0; z < mergedArr.length; z++) {
		System.out.println(mergedArr[z]);
	}
}
public static void main(String[] args) {
	
	
	int a1[]= {1,3,5,7};
	int a2[]= {2,3,6,6};
	
	merge(a1,a2);
	
}

}
