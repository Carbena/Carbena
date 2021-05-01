package gün3;

public class User {
	private int id;
	private String name;
	private String mail;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	
	public void setMail(String mail){
		this.mail=mail;
	}
	
	public User(int id, String name, String mail) {
		this.id=id;
		this.name=name;
		this.mail=mail;
	}
	
}
