package constructor;

import java.util.Scanner;

public class TimeMain {
	public static void main(String[] args) {
		TimeService t = new TimeService();
		int num;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("1.시작시간설정");
			System.out.println("2.시작시간 확인(년월일시분초)");
			System.out.println("3.종료시간설정");
			System.out.println("4.종료시간 확인(년월일시분초)");
			System.out.println("5.사용시간 가져오기");
			System.out.println(">>>");
			num = input.nextInt();

			switch(num) {
			case 1 :
				t.setStartTime();
				break;
			case 2:
				String sTime = t.getStartTime();
				System.out.println(sTime);
				break;
			case 3 :
				t.setEndTime();
				break;
			case 4 :
				String eTime = t.getEndTime();
				System.out.println(eTime);
				break;
			case 5 :
				System.out.println(t.getResultTime());
				break;
			}
		}

	}

}
