package com.huawei.test.report;

import com.huawei.test.*;

public class ReportToConsole implements Reportor {

	@Override
	public void report(TestRunner runner) {
		// TODO Auto-generated method stub
		System.out.println(runner.name + " result is " + runner.result.message);
	}

	@Override
	public void report_start_run(TestRunner runner) {
		// TODO Auto-generated method stub
		System.out.println(runner.name + " start running......");
	}

	@Override
	public void report_end_run(TestRunner runner) {
		// TODO Auto-generated method stub
		System.out.println(runner.name + " end running......");
	}

	@Override
	public void report_exception(TestRunner runner, Exception e) {
		// TODO Auto-generated method stub
		System.out.println(runner.name + " run error: " + e.getMessage());
	}

}
