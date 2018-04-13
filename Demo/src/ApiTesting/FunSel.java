package ApiTesting;


public class FunSel {
	
	
	static int i=6;
	
	
	void go(int funSel)
	{
		funSel++;
		System.out.println(funSel);
		
	}
public static void main(String[] args) {
	
	new FunSel().go(i);
}

	
	
	
	
}
