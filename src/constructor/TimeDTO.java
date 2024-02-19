package constructor;

public class TimeDTO {
	private long start, end, total;
	
	public long getStart() {
	return start;
	/*
	public TimeDTO(long start, long end, long total) {
		this.start = start;
		this.end = end;
		this.total = total;
		*/
	
	}
	public void setStart(long start) {
		this.start = start;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long end) {
		this.end = end;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}

}
