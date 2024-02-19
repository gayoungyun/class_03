package constructor;

import java.util.Scanner;

public class LoginService002 {
	public void display() {
		LoginDTO002 dto = new LoginDTO002(null, null);
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			int temp;
			temp = s.nextInt();
			
			switch(temp) {
			case 1 :
				if(dto.getId()== null && dto.getPwd()== null) {
					System.out.println("회원가입 먼저하세요");
					break;
				}
				String login_id;
				String login_pw;
				
				login_id = s.next();
				login_pw = s.next();
				
				if(!login_id.equals(dto.getId())) {
					System.out.println("존재하지 않는 id 입니다");
					break;
				}else if(!login_pw.equals(dto.getPwd())) {
					System.out.println("비밀번호가 틀렸습니다");
					break;
				}else {
					System.out.println("인증 통과");
				}
				break;
			case 2 :
				if(dto.getId() != null) {
					System.out.println("사용자가 존재합니다. 탈퇴 후 진행하세요");
					break;
				}else {
					login_id = s.next();
					login_pw =s.next();
					
					dto.setId(login_id);
					dto.setPwd(login_pw);
				}
				break;
			case 3 :
				if(dto.getId()== null && dto.getPwd()== null) {
					System.out.println("회원가입 먼저 진행하세요");
					break;
				}
				dto.setId(null);
				dto.setPwd(null);
				break;
			}
		}
	}

}
