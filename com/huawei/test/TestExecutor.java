package com.huawei.test;

public abstract class TestExecutor extends TestRunner{
	private TestOrganizator higher;
	
	public TestExecutor(String name, TestOrganizator higher){
		this.name = name;
		this.higher = higher;
		this.higher.register_subrunner(this);
	}
}
