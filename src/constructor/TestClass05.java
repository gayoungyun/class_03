package constructor;

public class TestClass05 {
	private String name, addr;
	public TestClass05() {
		System.out.println("기본 생성자");
	}
	
	private void display() {//저장클래스DTO, 출력연산 클래스
		System.out.println("1.저장합니다");
		name = "홍길동";//보통 이렇게 쓴다
		setAddr("산골짜기");
		System.out.println("2.출력합니다");
		System.out.println(getName());
		System.out.println(addr);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
