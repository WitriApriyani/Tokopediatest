package com.tokopedia.test.utils;

public enum TestScenario {

	T1("Log in");

private String testName;

TestScenario(String value) {
	testName = value;
} 

public String getTestName(){
	return testName;
}
}
