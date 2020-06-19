<<<<<<< HEAD
package ApiTesting;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiTestwithoutTestNG {

	public void aptTesting() throws Exception {
		try {
			URL url = new URL(
					"http://maps.googleapis.com/maps/api/geocode/json?address=chicago&sensor=false&#822");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException(" HTTP error code : "
						+ conn.getResponseCode());
			}

			Scanner scan = new Scanner(url.openStream());
			String entireResponse = new String();
			while (scan.hasNext())
				entireResponse += scan.nextLine();

			System.out.println("Response : " + entireResponse);

			scan.close();

			JSONObject obj = new JSONObject(entireResponse);
			String responseCode = obj.getString("status");

			// String responseCode = obj.getString("formatted_address");

			System.out.println("status : " + responseCode);

			JSONArray arr = obj.getJSONArray("results");
			for (int i = 0; i < arr.length(); i++) {
				String placeid = arr.getJSONObject(i).getString("place_id");
				// String types = arr.getJSONObject(i).getString("long_name");
				// System.out.println("types"+types);
				System.out.println("Place id : " + placeid);
				String formatAddress = arr.getJSONObject(i).getString(
						"formatted_address");
				System.out.println("Address :" + formatAddress);

				// address_components

				JSONObject c2 = arr.getJSONObject(0);
				// Storing JSON item in a Variable
				JSONObject region = c2.getJSONObject("geometry");// .getString("location_type");;
				JSONObject regionId = region.getJSONObject("viewport");
				JSONObject southwest = regionId.getJSONObject("southwest");

				Double lan = southwest.getDouble("lng");

				System.out.println("lan   " + lan);
				String strint = lan.toString();
				if (strint.equalsIgnoreCase("-87.940669")) {
					System.out.println("latitude values are same   pass");
				} else
					System.out.println("values are not same");

				// validating Address as per the requirement
				if (formatAddress.equalsIgnoreCase("Chicago, IL, USA")) {
					System.out.println("Address is as Expected");
				} else {
					System.out.println("Address is not as Expected");
				}
			}

			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
    public enum comparisonType { stepcomparison, previousrun };

	public static void main(String[] args) throws Exception {

		System.out.println("kkkkkkkk");
		
		 String usd = "USD";
	       
	        //Enum to String using Enum.valueOf()
		Enum myvalue= Enum.valueOf(comparisonType.class, "stepcomparison");
		 
		
		
		if (myvalue.equals(comparisonType.stepcomparison)) {
            System.out.println("dddddddddd");
        }
		
		ApiTestwithoutTestNG obj = new ApiTestwithoutTestNG();
		obj.aptTesting();
	}
=======
package ApiTesting;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiTestwithoutTestNG {

	public void aptTesting() throws Exception {
		try {
			URL url = new URL(
					"http://maps.googleapis.com/maps/api/geocode/json?address=chicago&sensor=false&#822");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException(" HTTP error code : "
						+ conn.getResponseCode());
			}

			Scanner scan = new Scanner(url.openStream());
			String entireResponse = new String();
			while (scan.hasNext())
				entireResponse += scan.nextLine();

			System.out.println("Response : " + entireResponse);

			scan.close();

			JSONObject obj = new JSONObject(entireResponse);
			String responseCode = obj.getString("status");

			// String responseCode = obj.getString("formatted_address");

			System.out.println("status : " + responseCode);

			JSONArray arr = obj.getJSONArray("results");
			for (int i = 0; i < arr.length(); i++) {
				String placeid = arr.getJSONObject(i).getString("place_id");
				// String types = arr.getJSONObject(i).getString("long_name");
				// System.out.println("types"+types);
				System.out.println("Place id : " + placeid);
				String formatAddress = arr.getJSONObject(i).getString(
						"formatted_address");
				System.out.println("Address :" + formatAddress);

				// address_components

				JSONObject c2 = arr.getJSONObject(0);
				// Storing JSON item in a Variable
				JSONObject region = c2.getJSONObject("geometry");// .getString("location_type");;
				JSONObject regionId = region.getJSONObject("viewport");
				JSONObject southwest = regionId.getJSONObject("southwest");

				Double lan = southwest.getDouble("lng");

				System.out.println("lan   " + lan);
				String strint = lan.toString();
				if (strint.equalsIgnoreCase("-87.940669")) {
					System.out.println("latitude values are same   pass");
				} else
					System.out.println("values are not same");

				// validating Address as per the requirement
				if (formatAddress.equalsIgnoreCase("Chicago, IL, USA")) {
					System.out.println("Address is as Expected");
				} else {
					System.out.println("Address is not as Expected");
				}
			}

			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
    public enum comparisonType { stepcomparison, previousrun };

	public static void main(String[] args) throws Exception {

		System.out.println("kkkkkkkk");
		
		 String usd = "USD";
	       
	        //Enum to String using Enum.valueOf()
		Enum myvalue= Enum.valueOf(comparisonType.class, "stepcomparison");
		 
		
		
		if (myvalue.equals(comparisonType.stepcomparison)) {
            System.out.println("dddddddddd");
        }
		
		ApiTestwithoutTestNG obj = new ApiTestwithoutTestNG();
		obj.aptTesting();
	}
>>>>>>> branch 'master' of https://github.com/Vinayakbansalgithub/Java_demo.git
}