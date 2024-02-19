package constructor;
class TestClass01 {
	public TestClass01() {//생성자목적 초기화
		System.out.println("생성자 실행");
	}
	public void test() {
		System.out.println("test 호출");
		
	}
}
public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();//생성자 호출 , 객체가 생성될때 자동으로 호출
		//t.test();
	}

}
