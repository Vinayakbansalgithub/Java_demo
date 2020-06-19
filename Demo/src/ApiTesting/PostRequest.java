package ApiTesting;
import java.io.Serializable;

import org.testng.Assert;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class PostRequest  {
	
	
	
	
	public void testCarDeserialization(Response response) {
        
	    Car myDeserializedCar = get("http://127.0.0.1:5984/restassuredcheckca").as(Car.class);
	         
	    System.out.println(myDeserializedCar.toString());
	     System.out.println(" car name  "+ myDeserializedCar.getMake());
	     
	    Assert.assertEquals("Check the car make", myDeserializedCar.getMake(), "Aston Martin");     
	}
	public static void main(String[] args) {
		
		
		
		
		
		
		Car myCar = new Car("Aston Martin","DB9",2004);
		
		
		Response responsePost=	given().
        contentType("application/json").
        body(myCar).
    when().
        post("http://127.0.0.1:5984/restassuredcheckcar");
		
		String bodypost = responsePost.getBody().asString();
		
		Headers id=responsePost.getHeaders();
		
		
    	System.out.println(bodypost);
		
		System.out.println("end  post");
		System.out.println(id);
/*		
		
		Response response=	 given().
		    when().
		        get("http://127.0.0.1:5984/restassuredcheckcar");*/
		
		
/*		System.out.println(response.getStatusCode());
		
		String body = response.getBody().asString();
    	System.out.println(body);*/
		
		
	   Car myDeserializedCar = get(responsePost.getHeader("Location")).as(Car.class);

		
		
		PostRequest obj= new PostRequest();
		
		
		System.out.println("end ");
		
	}
}
