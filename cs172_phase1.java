package test.twitter;
//package twittecrawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

public class Twitter4jExample 
{
	private final static String CONSUMER_KEY = "S2VHIHYnArgBmydFtOunvE7Ya";
	private final static String CONSUMER_KEY_SECRET = "vOVpMabL1GtS1wNg6Ry4cW7Rgx7HrrlJk1nG5wWjQJmdvkF4ms";

	public void start() throws TwitterException, IOException
	{
		Twitter twitter = new TwitterFactory().getInstance();
       		twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_KEY_SECRET);
        	twitter.setOAuthAccessToken(new AccessToken("989550013633064961-KRfaZf6fnRqVsu2VI8WXPOXLCOlO8CW", "hxjm1pnVmh7nZJqJiSJMJXH1zWEtSCiY6XiWCeghltKCM"));
		RequestToken requestToken = twitter.getOAuthRequestToken();
        	System.out.println("Authorization URL: \n" + requestToken.getAuthorizationURL());
        	
		//AccessToken accessToken = null;
 	
        	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	//while (null == accessToken) {
            	//	try {
                //		System.out.print("Input PIN here: ");
                //		String pin = br.readLine();
                //		accessToken = twitter.getOAuthAccessToken(requestToken, pin);
            	//	} catch (TwitterException te) {
                //		System.out.println("Failed to get access token, caused by: " + te.getMessage());
                //		System.out.println("Retry input PIN");
            	//	}
		//}
	}
		
	public static void main(String args[]) throws TwitterException, IOException
	{
		//Twitter twitter = new TwitterFactory().getInstance();
		//twitter.setOAuthConsumer("S2VHIHYnArgBmydFtOunvE7Ya", "vOVpMabL1GtS1wNg6Ry4cW7Rgx7HrrlJk1nG5wWjQJmdvkF4ms");
		//twitter.setOAuthAccessToken(new AccessToken("989550013633064961-KRfaZf6fnRqVsu2VI8WXPOXLCOlO8CW", "hxjm1pnVmh7nZJqJiSJMJXH1zWEtSCiY6XiWCeghltKCM"));
		//try {
		//	ResponseList statusReponseList = twitter.getUserTimeline(new Paging(1, 5));
		//	for (Status status : statusReponseList) 
		//	{
	        //		System.out.println(status.getText());
	      	//	}
		//	Status status = twitter.updateStatus("Hello");
	      	//	System.out.println("Successfully updated the status to [" + status.getText() + "].");
		//}
		//catch (Exception e) {
	    	//	
		//}	
	}
}

