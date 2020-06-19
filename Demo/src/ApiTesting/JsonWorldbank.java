package ApiTesting;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonWorldbank {
	public static void main(String[] args) throws JSONException {
		try {
			URL url = new URL(
					"http://api.worldbank.org/countries/ir?format=json");
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
			JSONObject json = new JSONObject(entireResponse);

			JSONArray array = json.getJSONArray("data");
			JSONObject c = array.getJSONObject(0);

			JSONArray array2 = array.getJSONArray(1);
			JSONObject c2 = array2.getJSONObject(0);

			// Storing JSON item in a Variable
			String name = c2.getString("name");
			String capitalCity = c2.getString("capitalCity");

		} catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
