package SelFrDemo;

import java.io.File;
import java.io.IOException;

public class RunBatch {
public static void main(String[] args) throws IOException {
	System.out.println("ewtet");
	File f = new File("D:\\Test2\\FileExist.txt");
	if(f.exists()){
		Runtime.getRuntime().exec("cmd /c start D:\\ranorex.bat");
	}
	else{
	    System.out.println("fail");
	}
}
}
