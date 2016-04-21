package com.huawei.test;
public interface Runnable {
	public void before_run();
	public TestResult run();
	public void after_run();
}
