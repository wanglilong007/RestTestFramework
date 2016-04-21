package com.huawei.smart;

import com.huawei.test.TestCase;
import com.huawei.test.TestResult;
import com.huawei.test.TestSuite;

public class Testcase3 extends TestCase {

	public Testcase3(String name, TestSuite suite) {
		super(name, suite);
		// TODO Auto-generated constructor stub
	}

	public TestResult run(){
		System.out.println("test case 3 running");
		this.result.code = 1;
		this.result.message = "test case 3 run success";
		this.result.result = true;
		return this.result;
	}
}
