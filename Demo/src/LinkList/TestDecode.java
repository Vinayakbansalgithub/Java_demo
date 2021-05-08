package LinkList;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
public class TestDecode {
	
	

public static void main(String[] args) throws UnsupportedEncodingException {
	String originalInput = "MTEyAGMAbXlzcWw=";
	
	
    // Decode
    byte[] base64decodedBytes = Base64.getDecoder().decode(originalInput);
	
    System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));
    
    String decoded =new String(base64decodedBytes, "utf-8");
    
    System.out.println("Original String: " + decoded);
    
    String base64encodedString = Base64.getEncoder().encodeToString(
    		//decoded.getBytes("utf-8"));
	" mysql".getBytes("utf-8"));
    
         System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);
         System.out.println("Base64 Encoded String (Basic) :" + originalInput);

    
}}
