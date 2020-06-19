package SelAppAutoTest;

import java.io.IOException;

public class AppiumStartFramework {
	static String nodePath = "\"C:\\Program Files (x86)\\Appium\\node.exe\"";
	static String appiumJSPath = "\"C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js\"";
	static String versionapp = "--address 127.0.0.1 --port 4723 --platform-name Android --platform-version 23 --automation-name Appium --log-no-color";
	static String cmd = nodePath + " " + appiumJSPath + " " + versionapp;
	static Process p;

	public static void StartAppium() throws IOException, InterruptedException {
		p = Runtime.getRuntime().exec(cmd);
		System.out.println(cmd);
		System.out.println("process name is " + p);

		Thread.sleep(10000);

		System.out.println("Appium has been started");
	}
}