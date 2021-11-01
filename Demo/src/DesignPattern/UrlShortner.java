package DesignPattern;

public class UrlShortner {

}
//URL Encoding –
//The encoding can be Base36( characters allowed [a-z][0-9]) or Base62( characters allowed [A-Z][a-z][0-9]) or Base64(characters allowed [A-Z][a-z][0-9],’+’,’/’).
//Since all of the characters in Base64 are URL safe characters, we will choose Base64 as our encoding technique.
//


// REST Endpoints
// create_shortURL( long_url, api_key, custom_url, expiry_date)
// redirect_shortURL( short_url)



//Url Length – Using Base64 encoding if we choose the
//
//URL with length 6, will give 64^6 = ~68.7 Billion URLs
//URL with length 7, will give 64^7 = 3.5 Trillion unique URLs
//URL with length 8, will give 64^8 = ~281 Trillion URLs
//
//We have already estimated that we would be storing 120B URLs, we can safely choose the short URL to be 7 characters long.
//
//Now, to generate a unique short URL, we can calculate the MD5 hash of the long URL, which will produce a 128-bit hash value. 
// Now when we encode the MD5 result to Base64 encoding the resultant string will be 22 characters long.
//
//(MD5 result = 32character output = 32*4bit = 128 bit output.
//Base64 encoding will use 6 bit to represent each character,
//MD5 -> Base64 give (128/6) ~ 22 character output)
//
//For choosing the short URL, first, we can randomly swap some character of the Base64 encoding result and then pick any 7 characters randomly from the result.

// Load Balancer Least Bandwidth Method – The algorithm will choose the server currently serving the least amount of traffic
//  Database Sharding if we have chosen 512 shards

// NoSQL databases, like Cassandra, work well for the purpose since they can deliver high read/write speeds.

//We know that read operations can be 100 times as high as write requests (according to the estimates we made earlier). 
//Since the database is going to be read very frequently, the output of read requests can be slow.


//Cache Eviction Policy LRU
// To overcome the problem of limited network bandwidth and single point of failue in url shortener service, we will use Load Balancers. 

//https://nlogn.in/designing-a-realtime-scalable-url-shortening-service-like-tiny-url/