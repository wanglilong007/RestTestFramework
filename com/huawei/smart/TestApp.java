package com.huawei.smart;

import com.huawei.test.TestProject;
import com.huawei.test.TestSuite;
import com.huawei.test.report.*;
import com.huawei.test.rest.RestClient;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleReporter console_reporter = new ConsoleReporter();
		RestClient rest_client = new RestClient("10.68.51.98");
		
		TestProject p = new TestProject("project test", console_reporter, rest_client);
		
		TestSuite s1 = new TestSuite("test suite 1", p);
		TestSuite s2 = new TestSuite("test suite 2", p);
		
		new Testcase1("c1", s1);
		new Testcase2("c2", s1);
		new Testcase3("c3", s2);

		p.run_test();
	}

}
