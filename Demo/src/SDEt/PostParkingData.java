package SDEt;

import static com.jayway.restassured.RestAssured.given;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.sun.media.multiplexer.audio.AUMux;

 public class PostParkingData extends ParkingLot {
	
	static String vehicleRegNo;
	static long duration;
	static int  amount;
	
	static StringBuffer buffer= new StringBuffer();
	
		public PostParkingData(int amount, long duration, String vehicleRegNo) {
			// TODO Auto-generated constructor stub
			
			
			this.vehicleRegNo=vehicleRegNo;
			this.duration=duration;
			this.amount=amount;
					
		}
	 

		public int postData() {
			// TODO Auto-generated method stub
			 
			// mocked URI
			 RestAssured.baseURI="https://www.ParkMyvehicle.com/RegNumber/ind/";
			
				String body1="{\"vehicleRegNo\":\"";
				String body2=vehicleRegNo;
				String body3="\",";
				String body4="\"duration\":\"";
				String body5=duration+"";
				String body6="\",";

				String body7="\"amount\":\"";
				String body8=amount+"";
				String body9="}";
				
				String body=body1+body2+body3+body4+body5+body6+body7+body8+body9;

				Response r = given().param("reg",vehicleRegNo )
				.contentType("application/json").
				body(body).
			    when().
			    post("");
				
				return r.statusCode();
		}
		
		
}
