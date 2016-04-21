package com.huawei.test.rest;

public class RestClient {
	public String host;
	
	public RestClient(String host){
		this.host = host;
	}
	
	public RestResponse get(String path){
		RestResponse resp = new RestResponse();
		resp.body="test schema";
		resp.code = 200;
		resp.headers = "test headers";
		return resp;
	}
	
	public RestResponse put(String path){
		return null;
	}

	public RestResponse post(String path){
		return null;
	}
	
	public RestResponse delete(String path){
		return null;
	}
}
