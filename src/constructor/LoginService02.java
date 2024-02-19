package constructor;

import java.util.Scanner;

public class LoginService02 {
	LoginDTO02 dto;
	String userId, userPwd;
	public void display() {
		Scanner input = new Scanner(System.in);
		String userId, userPwd;

		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.print(">>>");
			int num = input.nextInt();
			switch(num) {

			case 1: 
				System.out.println("로그인 기능");
				loginCheck();
				break;

			case 2 :
				System.out.println("회원가입 기능");
				register();
				break;

			case 3 :
				System.out.println("탈퇴 기능");
				memberExit();
				break;
			default:
			}
		}
	}
	public void memberExit() {
		dto = null;
		System.out.println("탈퇴 되었습니다");
	}
	public void inputData(String msg1, String msg2) {
		Scanner input = new Scanner(System.in);

		System.out.println(msg1);
		userId = input.next();
		System.out.println(msg2);
		userPwd = input.next();
	}
	public void register() {
		dto = new LoginDTO02();
		inputData("회원가입 id입력","회원가입 pwd입력");

		dto.setId(userId);
		dto.setPwd(userPwd);
		System.out.println("===회원가입 성공===");
	}
	public void loginCheck() {
		inputData("인증 id입력","인증 pwd 입력");
		System.out.println("dto : "+dto);
		System.out.println("userId : "+userId);
		if(dto != null)
			if(userId.equals(dto.getId())) {
				if(userPwd.equals(dto.getPwd())) {
					System.out.println("인증 통과");
				}else {
					System.out.println("비밀번호 틀림");
				}
			}else {
				if(dto.getId()== null) {
					System.out.println("회원가입 먼저 하세요");
				}else
					System.out.println("아이디가 일치하지 않습니다");
			}else
				System.out.println("1111회원가입 먼저하세요");

	}
}









