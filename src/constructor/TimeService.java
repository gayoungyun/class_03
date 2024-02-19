package constructor;

import java.text.SimpleDateFormat;

public class TimeService {
	private TimeDTO dto;
	public TimeService() {
		dto = new TimeDTO();
	}
	public void setStartTime() {
		System.out.println("서비스 시간설정");
		long start = System.currentTimeMillis();
		dto.setStart(start);
	}
	public String getStartTime() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String sTime = s.format(dto.getStart());
		return sTime;
	}
	public void setEndTime() {
		long end = System.currentTimeMillis();
		dto.setEnd(end);
		dto.setTotal((end-dto.getStart())/1000);
	}
	public String getEndTime() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String eTime = s.format(dto.getEnd());
		return eTime;
	}
	public String getResultTime() {
		long total = dto.getTotal();
		int m = (int)total/60;
		int s = (int)total%60;
		return m+"분"+s+"초 사용";
	}
}
