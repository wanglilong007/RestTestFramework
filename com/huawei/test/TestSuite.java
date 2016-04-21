package com.huawei.test;

import com.huawei.test.report.Reportor;
import com.huawei.test.report.TestReporter;
import com.huawei.test.rest.RestClient;

public class TestSuite extends TestOrganizator {

	public TestSuite(String name, TestProject project) {
		super(name, project);
		// TODO Auto-generated constructor stub
	}
	
	public TestSuite(String name, TestReporter test_reporter, RestClient client, TestProject project) {
		super(name, test_reporter,client, project);
		// TODO Auto-generated constructor stub
	}
}
