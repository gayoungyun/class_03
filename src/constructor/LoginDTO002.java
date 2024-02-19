package constructor;

public class LoginDTO002 {
	private String id, pwd;
	
	public LoginDTO002(String id, String pwd) {
		this.id = id;
		this.pwd= pwd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
