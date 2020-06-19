package SelFrDemo;

import java.io.FileReader;
import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class AppiumStartAndStopDEMO {
	private static Process process;
	private static String APPIUMSERVERSTART = "C:\\Program Files (x86)\\Appium\\Appium";    
	

	public static void startAppiumServer() throws IOException, InterruptedException {
	 /*  
	    Thread.sleep(5000);
	    process = runtime.exec("C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js");
	    Thread.sleep(5000);*/
		
		
		
		String command = "C:\\Program Files (x86)\\Appium\\node.exe lib\\server\\main.js --command-timeout 120 --session-override" + "" + " --platform-name " + "Android"  + " --log-timestamp -a 0.0.0.0 -p "+4723;
		 Runtime runtime = Runtime.getRuntime();
		    process = runtime.exec(command);
	}
	  

	public static void stopAppiumServer() throws IOException {
	    if (process != null) {
	        process.destroy();
	    }
	    System.out.println("Appium server stop");
	}

	public static void main(String args[]) throws IOException, InterruptedException {        
	    startAppiumServer();
	  //  stopAppiumServer();
}
}
