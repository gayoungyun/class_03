package com.care.abc;

import com.care.test.TestClass;

public class MainClass {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.test();
		//tc.test2();// 패키지가 달라서( public 시작하는것만 가능)
	}

}
