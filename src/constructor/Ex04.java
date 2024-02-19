package constructor;

import java.util.ArrayList;

class TestClass04 {
	public TestClass04(int num) {
		System.out.println("매개변수 받는 생성자");
	}
	public TestClass04() {//무조건 하나 있어야한다
		System.out.println("기본 생성자 실행");
	}
	public void test() {
		System.out.println("test 호출");
		
	}
	public void test(int num) {
		System.out.println(num+"test 호출");
		
	}
}
public class Ex04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		t.test(); t.test(100);
		
		ArrayList arr = new ArrayList<>();
		String s = new String();
		String s1 = new String("값 전달");
		
	}

}
