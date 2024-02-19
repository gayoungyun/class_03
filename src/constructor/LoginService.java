package constructor;

import java.util.Scanner;

public class LoginService {
	Scanner input = new Scanner(System.in);
	LoginDTO t = new LoginDTO();//바깥쪽에 만들어야함
	public void display() {
		int num;
	
		while(true) {
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 탈퇴");
		num= input.nextInt();
		switch (num) {
		case 1 :
			if(t.getId() == null && t.getPwd()== null) {
				
			}
		}
	}
	
	public void printData() {
		System.out.println("회원가입 id : "+t.getId());
		id = input.next();
		if()
		
	}
	public void savaData() {
		String id = "dd"
		t = new LoginService();
		t.setId(id); t.setPwd(pwd);
		System.out.println("저장");
	}

}
