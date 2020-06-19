package SelFrDemo;

import java.io.IOException;
import java.io.File;
import java.io.PrintStream;

public class SystemDemo {
	public static void main(String... args) throws IOException {
		Runtime r = Runtime.getRuntime();
		r.exec("notepad");

		File txt = new File("D:/DemoTxt1.txt");
		if (!txt.exists()) {
			txt.createNewFile();
		}
		PrintStream ps = new PrintStream(txt);
		ps.println("hello vinayak bansal");
		ps.close();
	}

}
