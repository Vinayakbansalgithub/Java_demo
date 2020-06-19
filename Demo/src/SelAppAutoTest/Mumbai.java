package SelAppAutoTest;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.*;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Mumbai {
	static Response res;

	public static void main(String[] args) throws JSONException {
		System.out.println("hello mumbai");

		ArrayList<String> list = new ArrayList<String>();
		
		RestAssured.baseURI = "https://maps.googleapis.com";
		Response res = given()

				.param("query", "restaurants in mumbai").param("key", "AIzaSyDdLXtlqy6R1PtVXDlgOfveXXO5gNGg9PM")

				.when().get("/maps/api/place/textsearch/json");
		ResponseBody resbody = res.body();

		String responseBody = res.getBody().asString();
		System.out.println("Response : " + responseBody);
		System.out.println("stattus code is   " + res.statusCode());
		// Assert.assertEquals(res.statusCode(), 200);
		JSONObject obj = new JSONObject(responseBody);

		if (res.statusCode() == 200) {
			JSONArray arr = obj.getJSONArray("results");
			for (int i = 0; i < arr.length(); i++) {
				System.out.println(arr.length());
				JSONObject c2 = arr.getJSONObject(i);
				String str = c2.getString("formatted_address");
				System.out.println("formatted_address" + str);
				String strint = str.toString();
				list.add(strint.toString());

			}
			Boolean flag = false;
			System.out.println("list valus are");
			for (int i = 0; i < list.size(); i++) {
				System.out.println("value " + i + "  " + list.get(i));
				if (list.get(i)
						.equalsIgnoreCase(
								"JJ LOGISTICS PACKERS MOVERS, CALL @ 9260018001, 11, Sahar Elevated Rd, Sahar Village, Andheri East, Mumbai, Maharashtra 400059, India")) {
					System.out.println(" values are same   pass");

					ExtentReports extent = new ExtentReports(
							"D:/TestReport.html", true);

					// starting test
					ExtentTest test = extent.startTest("Api Test Mmbai Cafe",
							"Verifed  " + list.get(i));

					// step log
					test.log(LogStatus.PASS, "Step details");

					// ending test
					extent.endTest(test);

					// writing everything to document
					extent.flush();
					flag = true;
					break;
				}
			}
			if (flag == false) {

				System.out.println("values are not same");
				ExtentReports extent = new ExtentReports("D:/TestReport.html",
						true);
				// starting test ExtentTest test =
				ExtentTest test = extent.startTest("Api Test Mumbai Cafe",
						"Not found in the list  ");

				test.log(LogStatus.FAIL, "Step details");

				extent.endTest(test);

				// writing everything to document

			}
		}

	}
}
