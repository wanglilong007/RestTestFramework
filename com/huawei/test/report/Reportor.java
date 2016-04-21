package com.huawei.test.report;

import com.huawei.test.TestRunner;

public interface Reportor {
	public void report_start_run(TestRunner runner);
	public void report(TestRunner runner);
	public void report_exception(TestRunner runner, Exception e);
	public void report_end_run(TestRunner runner);
}
