package com.huawei.test.report;

public class ExcelReporter extends TestReporter {
	public ExcelReporter(){
		this.reportor = new ReportToExcel();
	}
}
