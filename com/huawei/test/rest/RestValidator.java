package com.huawei.test.rest;

import com.huawei.test.TestCase;
import com.huawei.test.exception.*;

public class RestValidator {
	public RestResponse reponse;
	public TestCase testcase;

	public RestValidator(RestResponse resp, TestCase testcase) {
		// TODO Auto-generated constructor stub
		//this.reponse = new RestResponse();
		this.reponse = resp;
		this.testcase = testcase;
	}

	public void test_schema(String schema){
		
		try {
				if(!this.reponse.body.equals(schema)){
					throw new SchemaException("scheme validate error!");
				}
			} catch (SchemaException e) {
				// TODO Auto-generated catch block
				testcase.test_reporter.report_exception(testcase, e);
				e.printStackTrace();		
			}
	}
	
	public void test_status(int code){
		if(this.reponse.code != code)
			try {
				throw new StatusException("status code validate error!");
			} catch (StatusException e) {
				// TODO Auto-generated catch block
				testcase.test_reporter.report_exception(testcase, e);
				e.printStackTrace();
			}
	}
	
	public void test_value(){
		
	}
	
	public void test_header(){
		
	}
	public void test_cookie(){
		
	}
}
