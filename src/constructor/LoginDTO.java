package constructor;

public class LoginDTO {
	private String id;
	private int pwd;
	public LoginDTO(String id, int pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	public LoginDTO() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

}
