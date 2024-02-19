package com.care.test;

class Test001{//디폴트
	void test001() {
		System.out.println("Test001 test001 메소드");
	}
}
public class TestClass {//public class 한 파일에 한개만
	public void test() {
		System.out.println("test 메소드");
		
	}
	void test2() {//디폴트- 같은 패키지에서는 접근가능
		System.out.println("test2 메소드");
	}

}
