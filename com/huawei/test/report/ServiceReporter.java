package com.huawei.test.report;

public class ServiceReporter extends TestReporter{
	
	public ServiceReporter(){
		this.reportor = new ReportToService();
	}

}
