package com.experitest.auto;

import java.net.MalformedURLException;

public class mainClass {

	public static void main(String[] args) throws MalformedURLException {
		Test2 test=new Test2();
		test.setUp();
		test.quickStartiOSNativeDemo();
		test.tearDown();
	}

}
