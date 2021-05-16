package library.entity;

public class stulogin {
	 public stulogin(){
		
	}
	String email;
	String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "stulogin [email=" + email + ", password=" + password + "]";
	}
	public stulogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
}
