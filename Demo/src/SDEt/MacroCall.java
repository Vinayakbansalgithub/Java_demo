package SDEt;

import java.io.IOException;
import Trees.TestDifferentPackage;
class AA{
	
	private static int imgs=10;
	class Bb
    {
        //inner class
	 
	 int imgs=10;
    }
	
	
}


public class MacroCall extends AA {

	
public static void main(String[] args) throws IOException {
	AA obj= new AA();
	MacroCall.Bb b = obj.new Bb();

			System.out.println(b.imgs);
}
}
