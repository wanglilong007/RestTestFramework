package com.huawei.smart;
import com.huawei.test.*;
import com.huawei.test.rest.*;

public class Testcase2 extends TestCase {

	public Testcase2(String name, TestSuite suite) {
		super(name, suite);
		// TODO Auto-generated constructor stub
	}

	public TestResult run(){
		System.out.println("test case 2 running");
		
		//RestClient client = new RestClient("10.68.51.98");
		RestResponse resp = this.rest_client.get("/test");
		RestValidator validator = new RestValidator(resp,this);
		validator.test_schema("test s schema");
		validator.test_status(202);
		
		this.result.code = 1;
		this.result.message = "test case 2 run success";
		this.result.result = true;
		return this.result;
	}
}
