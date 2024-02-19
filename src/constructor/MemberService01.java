package constructor;

import java.util.Scanner;

public class MemberService01 {
	Scanner input = new Scanner(System.in);
	MemberDTO t = new MemberDTO(null, 0,0,0);
	public void display() {
		int num;

		while(true) {
			System.out.println("1.학생등록");	
			System.out.println("2.학생보기");	
			System.out.println("3.정보수정");	
			System.out.println("4.회원탈퇴");	
			num = input.nextInt();

			switch(num) {
			case 1 : registerMember(); break;
			case 2 : viewMember(); break;
			case 3 : modifyMember(); break;
			case 4 : exitMember(); break;
			default : System.out.println("번호를 다시 입력하세요");
			}
		}
	}
	public void registerMember() {
		Scanner input = new Scanner(System.in);
		int num;
		//if(num ==1) {
		String name;
		int kor, eng, math, sum;

		System.out.print("이름 : ");
		name = input.next();
		System.out.print("국어 : ");
		kor = input.nextInt();
		System.out.print("영어 : ");
		eng = input.nextInt();
		System.out.print("수학 : ");
		math = input.nextInt();
		t.setName(name); t.setKor(kor); t.setEng(eng); t.setMath(math);
		//sum = kor+eng+math;
		t.setSum(kor+eng+math);
	}

	public void viewMember() {
		Scanner input = new Scanner(System.in);
		int num;
		//if(num == 2) {
		System.out.println("이름 : "+t.getName());
		System.out.println("국어 : "+t.getKor());
		System.out.println("영어 : "+t.getEng());
		System.out.println("수학 : "+t.getMath());
		System.out.println("합계 : "+t.getSum());
	}

	public void modifyMember() {
		//if(num == 3) {
		String name= null;
		int kor= 0, eng= 0, math= 0;
		System.out.println("1. 이름수정 2. 국어수정 3.영어수정 4.수학수정");
		System.out.println(">>>");
		int choice = input.nextInt();
		if(choice == 1) {
			System.out.println("변경이름");
			//name = input.next();
			t.setName(input.next());
		} if(choice == 2) {
			System.out.println("변경국어점수");
			t.setKor(input.nextInt());
		}if(choice ==3) {
			System.out.println("변경영어점수");
			t.setEng(input.nextInt());
		}if(choice ==4) {
			System.out.println("변경수학점수");
			t.setMath(input.nextInt());
		}
		System.out.println("이름 : "+t.getName());
		System.out.println("국어 : "+t.getKor());
		System.out.println("영어 : "+t.getEng());
		System.out.println("수학 : "+t.getMath());

	}


	public void exitMember() {
		//if(num ==4) {

		t.setName(null);  
		t.setKor(0);
		t.setEng(0); 
		t.setMath(0); 
		t.setSum(0);
		System.out.println("회원탈퇴");

	}
}









