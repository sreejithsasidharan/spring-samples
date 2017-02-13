package com.javapapers.java.social.facebook.util;

public class TestFB {

	public static final String FB_APP_ID = "1091610297517508";
	public static final String FB_APP_SECRET = "bfd976839b10f6e2617ae0d717538e72";
	public static final String REDIRECT_URI = "http://secure.hotcoursesabroad.com:7001/SpringPDFViewer/fbauth.jsp";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookGraph.getAccessTokenURL(FB_APP_ID, FB_APP_SECRET, REDIRECT_URI);
	}

}
