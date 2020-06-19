package ApiTesting;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
public class ApiTime {
public static void main(String[] args) {
	RestAssured.baseURI="https://www.googleapis.com/books/v1/";
	Response response=given().param("q", "turing").when().get("/volumes");
	System.out.println(" status code  "+response.getStatusCode());
}

}
