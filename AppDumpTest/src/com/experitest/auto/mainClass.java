package com.experitest.auto;

import java.net.MalformedURLException;

public class mainClass {

	public static void main(String[] args) throws MalformedURLException {
		Test1 test=new Test1();
		test.setUp();
		test.quickStartiOSNativeDemo();
		test.tearDown();
	}

}
