package ArrayQuestions;

public class PrintSpiralMatrix {
	
	static void spiralPrint(int r, int c, int[][] a) {
		
		
		int rowStart=0;
		int rowEnd=r;
		int columnStrat=0;
		int columnEnd=c;
		
		
		
		
		while(rowStart<rowEnd && columnStrat<columnEnd) {
			
			
			for (int i = columnStrat; i < columnEnd; i++) {
				
				System.out.println(a[rowStart][i]);
				
			}
			
			rowStart++;
			
			

			for (int i = rowStart; i < rowEnd; i++) {
				
				System.out.println(a[i][columnEnd-1]);
				
			}
			
			columnEnd--;
			
		
			
	if(rowStart<rowEnd)
	for (int i = columnEnd-1; i >= columnStrat; i--) {
		

				
				System.out.println(a[rowEnd-1][i]);
				
			}
			
			rowEnd--;
			
			
			
			
			if(rowStart<rowEnd)
	
	for (int i = rowEnd-1; i >= rowStart; i--) {
				
				System.out.println(a[i][columnStrat]);
				
			}
			
	columnStrat++;
			
			
			
			
		}
		
		
		
	} 
	
	public static void main(String[] args) 
    { 
        int R = 4; 
        int C = 7; 
        int a[][] = { { 1, 2, 3, 4, 5, 6 ,1}, 
                      { 7, 8, 9, 10, 11, 12,1 }, 
                      { 13, 14, 15, 16, 17, 18,1 } ,
                      
                      { 19, 20, 21, 22, 23, 24 ,1} }; 
        spiralPrint(R, C, a); 
    }

	
}
