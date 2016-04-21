package com.huawei.test;

import com.huawei.test.report.TestReporter;
import com.huawei.test.rest.RestClient;

public abstract class TestRunner implements Runnable {
	public String name;
	public TestReporter test_reporter;
	public RestClient rest_client;
	public TestResult result;
	//public Reportor reportor;
	
	public TestRunner(){
		this.result = new TestResult();
		//this.reportor = new ReportToConsole();
		//this.test_reporter = new TestReporter();
	}
	
	public final void before_run(){
		this.test_reporter.report_start_run(this);
	}

	public final void after_run(){
		//this.test_reporter.report(this);
		this.test_reporter.report_end_run(this);
	}
}
