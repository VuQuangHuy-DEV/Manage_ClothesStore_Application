package entity;

public class DangNhap {
	private String user;
	private String pass;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public DangNhap(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	public DangNhap() {
		super();
	}
	@Override
	public String toString() {
		return "DangNhap [user=" + user + ", pass=" + pass + "]";
	}
	
	 

}
