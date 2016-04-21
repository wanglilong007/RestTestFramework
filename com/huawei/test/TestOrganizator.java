package com.huawei.test;
import java.util.ArrayList;

import com.huawei.test.report.*;
import com.huawei.test.rest.RestClient;

public abstract class TestOrganizator extends TestRunner {
	private ArrayList<TestRunner> subrunners;
	private TestOrganizator higher;
	
	public TestOrganizator(String name){
		this.name = name;
		subrunners = new ArrayList<TestRunner>();
	}
	
	public TestOrganizator(String name, TestReporter test_reporter, RestClient client){
		this.name = name;
		this.test_reporter = test_reporter;
		this.rest_client = client;
		subrunners = new ArrayList<TestRunner>();
	}
	
	public TestOrganizator(String name, TestOrganizator higher){
		this.name = name;
		this.higher = higher;
		subrunners = new ArrayList<TestRunner>();
		this.higher.register_subrunner(this);
	}
	
	public TestOrganizator(String name, TestReporter test_reporter, RestClient client, TestOrganizator higher){
		this.name = name;
		this.test_reporter = test_reporter;
		this.rest_client = client;
		this.higher = higher;
		subrunners = new ArrayList<TestRunner>();
		this.higher.register_subrunner(this);
	}
	
	public final TestResult run(){
		boolean result = true;
		for(int i=0; i<subrunners.size(); i++){
			Runnable tr = subrunners.get(i);
			tr.before_run();
			boolean son_result = tr.run().result;
			result = result && son_result;
			tr.after_run();
		}
		this.result.result = result;
		this.result.code = 1;
		this.result.message = "this is " + this.name + " run result";
		return this.result;
	}
	
	public void register_subrunner(TestRunner tr){
		tr.test_reporter = this.test_reporter;
		tr.rest_client = this.rest_client;
		subrunners.add(tr);
	}
}
