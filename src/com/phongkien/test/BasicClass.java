package com.phongkien.test;

public class BasicClass {
	private String privateVar;
	public String publicVar;
	protected String protectedVar;
	String defaultVar;
	
	public String getPrivateVar() {
		return this.privateVar;
	}

	public String getPrivateVarNoThis() {
		return privateVar;
	}

	public void MethodNoParamNoReturn() {
		
	}
	
	public String MethodNoParamWithReturn() {
		return "Hello";
	}
	
	public String MethodWithParamWithReturn(String param1) {
		return param1;
	}
	
	public String MthodWithTwoParamsWithReturn(String param1, String param2) {
		return param1 + ":" + param2;
	}
}
