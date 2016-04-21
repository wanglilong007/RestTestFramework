package com.huawei.test;

import com.huawei.test.report.TestReporter;
import com.huawei.test.rest.RestClient;

public class TestProject extends TestOrganizator {
	
	public TestProject(String name){
		super(name);
	}
	
	public TestProject(String name, TestReporter test_reporter, RestClient client){
		super(name, test_reporter, client);
	}
	
	public void run_test(){
		this.before_run();
		this.run();
		this.after_run();
	}
	
	public void set_reportor(TestReporter test_reporter){
	  this.test_reporter = test_reporter;
	}
	
	public void set_restclient(RestClient client){
		this.rest_client = client;
	}

}
