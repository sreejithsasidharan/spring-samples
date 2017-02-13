package com.javapapers.java.social.facebook.util;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import com.javapapers.java.social.facebook.FBConnection;

public class FacebookGraph {

	public static String FB_APP_ID ;
	public static String FB_APP_SECRET;
	public static String REDIRECT_URI ;
	
	public static String FB_AUTH_URL ="http://www.facebook.com/dialog/oauth?client_id=";
	public static String FB_GRAPH_URL = "https://graph.facebook.com/me?fields=name,first_name,last_name,email,gender&access_token=";

	FacebookGraph(){
		
	}
	public static StringBuilder getAccessTokenURL( String fbAppId, String fbAppSecretKey, String redirectionURL){
	
		FB_APP_ID = fbAppId;
		FB_APP_SECRET = fbAppSecretKey;
		REDIRECT_URI = redirectionURL;
		
		StringBuilder authUrl = new StringBuilder();
				
		try {			
			
			authUrl.append(FB_AUTH_URL+ FB_APP_ID);
			
			authUrl.append("&redirect_uri="+  URLEncoder.encode(REDIRECT_URI, "UTF-8"));
			
			authUrl.append("&scope=email");		
							
			System.out.println( "authUrl 1111" + authUrl);
						
		} catch (Exception e) {
			throw new RuntimeException("ERROR in getting FB Auth URL. " + e);
		}
		
		return authUrl;		
	}
	
	
	public static String getFBGraphUrl(String code) {
		String fbGraphUrl = "";
		try {
			fbGraphUrl = "https://graph.facebook.com/oauth/access_token?"
					+ "client_id=" + FBConnection.FB_APP_ID + "&redirect_uri="
					+ URLEncoder.encode(FBConnection.REDIRECT_URI, "UTF-8")
					+ "&client_secret=" + FBConnection.FB_APP_SECRET + "&code=" + code;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return fbGraphUrl;
	}

	
	public static String getFBUserDetails ( String accessToken){
		
		String graph = null;
		try {

			String g = getFBGraphUrl( accessToken);
			System.out.println("g 111= " + g);
			URL u = new URL(g);
			URLConnection c = u.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					c.getInputStream()));
			String inputLine;
			StringBuffer b = new StringBuffer();
			while ((inputLine = in.readLine()) != null)
				b.append(inputLine + "\n");
			in.close();
			graph = b.toString();
			System.out.println(graph);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("ERROR in getting FB graph data. " + e);
		}
		return graph;
		
	}
	
}
