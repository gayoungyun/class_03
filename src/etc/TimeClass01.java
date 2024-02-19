package etc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeClass01 {//시간얻어오는 기능
	public static void main(String[] args) {
		long time = System.currentTimeMillis();//더큰 정수를 저장할때long, 시간을 초단위로
		System.out.println(time);
		
		SimpleDateFormat si = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");//
		
		String s = si.format(time);
		System.out.println(s);
		
		System.out.println("-----------------------");
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(si.format(date));
		
	}

}
