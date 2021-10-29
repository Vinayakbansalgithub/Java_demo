package DesignPattern;

public class UrlShortner {

}
//URL Encoding – The encoding can be Base36( characters allowed [a-z][0-9]) or Base62( characters allowed [A-Z][a-z][0-9]) or Base64(characters allowed [A-Z][a-z][0-9],’+’,’/’). Since all of the characters in Base64 are URL safe characters, we will choose Base64 as our encoding technique.
//
//Url Length – Using Base64 encoding if we choose the
//
//URL with length 6, will give 64^6 = ~68.7 Billion URLs
//URL with length 7, will give 64^7 = ~5 Trillion URLs
//URL with length 8, will give 64^8 = ~281 Trillion URLs
//
//We have already estimated that we would be storing 120B URLs, we can safely choose the short URL to be 7 characters long.
//
//Now, to generate a unique short URL, we can calculate the MD5 hash of the long URL, which will produce a 128-bit hash value. Now when we encode the MD5 result to Base64 encoding the resultant string will be 22 characters long.
//
//(MD5 result = 32character output = 32*4bit = 128 bit output.
//Base64 encoding will use 6 bit to represent each character,
//MD5 -> Base64 give (128/6) ~ 22 character output)
//
//For choosing the short URL, first, we can randomly swap some character of the Base64 encoding result and then pick any 7 characters randomly from the result.
//URL Shortner Working
//URL Shortener Working

//https://nlogn.in/designing-a-realtime-scalable-url-shortening-service-like-tiny-url/