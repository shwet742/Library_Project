package library.entity;

public class sturegister {

	public sturegister(){
		
	}
	int id;
	String stuname;
	String address;
	String contact;
	String email;
	String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
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
		return "sturegister [id=" + id + ", stuname=" + stuname + ", address=" + address + ", contact=" + contact
				+ ", email=" + email + ", password=" + password + "]";
	}
	public sturegister(int id, String stuname, String address, String contact, String email, String password) {
		super();
		this.id = id;
		this.stuname = stuname;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.password = password;
	}
	
	
}
