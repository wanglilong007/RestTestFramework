package com.huawei.test.report;

import com.huawei.test.TestRunner;

public abstract class TestReporter {
	public Reportor reportor;
	
	public TestReporter(){
		
	}
	
	public TestReporter(Reportor reportor){

		this.reportor = reportor;
	}

	public void report(TestRunner runner){
		reportor.report(runner);
	}
	
	public void report_start_run(TestRunner runner){
		reportor.report_start_run(runner);
	}
	
	public void report_end_run(TestRunner runner){
		reportor.report_end_run(runner);
	}
	
	public void report_exception(TestRunner runner, Exception e){
		reportor.report_exception(runner, e);
	}
}
