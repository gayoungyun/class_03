package etc;

import java.util.Date;

public class SleepClass01 {
	public static void main(String[] args) {
		for(int i =0; i<5; i++) {
			System.out.println(i+" : "+new Date());
			
			try {
				Thread.sleep( 100 );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("시작");
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
			long end = System.currentTimeMillis();//1000
			System.out.println("종료");
			System.out.println("사용 시간 : "+(end-start)/1000);
		
	}

}
