package com.demoTest.enumDemo;

public enum EnumInstanceField {
	
	TEST("getmealone"),
	RSET("getmealonerest"),
	WASTE("getmealonewaste");

	private String url;
	private EnumInstanceField(String url){
		this.url=url;
	}
	
	public String getUrl(){
		return url;
	}
	
	

}
