package constructor;

import java.util.Scanner;

public class MemberService02 {
	private MemberDTO02 member;
	public MemberService02() {
		member = new MemberDTO02();}
	public void display() {
		Scanner input= new Scanner(System.in);
		int num;

		while(true) {
			System.out.println("1.학생 등록");
			System.out.println("2.학생 보기");
			System.out.println("3.학생 정보 수정");
			System.out.println("4.회원 탈퇴");
			System.out.print(">>> : ");
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
		String name;
		int kor, eng, math;
		System.out.println("이름 입력 : ");
		name = input.next();
		System.out.println("국어점수 입력 : ");
		kor = input.nextInt();
		System.out.println("영어점수 입력 : ");
		eng = input.nextInt();
		System.out.println("수학점수 입력 : ");
		member.setMath(input.nextInt());
		member.setName(name);
		member.setKor(kor);
		member.setEng(eng);
		System.out.println("저장되었습니다");
		member.setSum(kor+eng+member.getMath());
		member.setAvg(member.getSum()/3.0);
		if(member.getAvg()>=90)
			member.setGrade("A");
		else if(member.getAvg()>=80)
			member.setGrade("B");
		else member.setGrade("CCC");
	}
	public void viewMember() {
		System.out.println("-----------");
		if(member.getName() != null) {
			System.out.println(member.getName()+"님의 정보입니다");
			System.out.println("국, 영, 수 : "+member.getKor()+","
					+member.getEng()+","+member.getMath());

			System.out.println("합 : "+member.getSum());
			System.out.println("평균 : "+member.getAvg());
			System.out.println("등급 : "+member.getGrade());
			System.out.println("--------------");
		}else
			System.out.println("회원가입 먼저하세요");
	}
	public void modifyMember() {

		System.out.println("=========");
		System.out.println("이름은 수정할 수 없습니다");
		Scanner input = new Scanner(System.in);
		int kor, eng, math;
		System.out.println("수정 국어점수 : ");
		kor= input.nextInt();
		System.out.println("수정 영어점수 : ");
		eng = input.nextInt();
		System.out.println("수정 수학점수 : ");
		member.setMath(input.nextInt());
		System.out.println("수정되었습니다");

		member.setKor(kor);
		member.setEng(eng);
		System.out.println("저장되었습니다");

		member.setSum(kor+eng+member.getMath());
		member.setAvg(member.getSum()/3.0);
		if(member.getAvg()>=90)
			member.setGrade("A");
		else if(member.getAvg()>=80)
			member.setGrade("B");
		else member.setGrade("CCC");

	}
	public void exitMember() {
		member.setName(null);
	}
}

