package SDEt;

public class LargestIncrementSequence {

	public static void main(String[] args) {
		int[] arr= new int[]{1,2,4,1,3,1,4,7,8};
		
		int i=0;
		int j=1;
		while (j < arr.length) {
			
			
			
			if(arr[i]<arr[j]){
				
				if(i==j-1){
				i++;
				j++;
				}
				else{
					arr[++i]=arr[j];
					
				}
				
			}
			else{
				
				while(arr[j]<arr[i]){
					
					j++;
					
				}
				arr[++i]=arr[j++];
				
			}
			
			
			
		}
		
		
	for (int j2 = 0; j2 < i; j2++) {
		System.out.println(arr[j2]);
	}
		
		
		
		
		
	}
	
}
