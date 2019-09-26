package ApiTesting;

public class ThoughtsWorks {
public static void main(String[] args) {
	String url="https://http-hunt.thoughtworks-labs.net/challenge";
	HttpGet request=new HttpGet(url);
	request.addHeader("User-Agent",USER_AGENT);
	HttpResponse response=client.execute(request);
	int responseCode=response.getStatusLine().getStatusCode();
	System.out.println("Response Code: " + responseCode);
}
}
