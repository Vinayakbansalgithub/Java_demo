package SelFrDemo;

import java.io.IOException;
import java.io.InputStreamReader;


public class listofdevices {
	static int count= 0;
public static void main(String[] args) throws IOException {
	String device_adb = "adb devices";
	
	Process p_device = Runtime.getRuntime().exec(device_adb);
	// System.out.println("process name is " + p);

	java.io.InputStream is = p_device.getInputStream();
	java.io.BufferedReader reader = new java.io.BufferedReader(
			new InputStreamReader(is));
	reader.readLine();
	for (int i = 0; i < 5; ++i) {
		
		String lineIWant = reader.readLine();
		System.out.println(lineIWant);
		if(lineIWant==null)
		{
		count++;
			
		}
		
	
}
	System.out.println(count);
}
}
