package control;

public class User {
	public String name;
	public String password;
	@Override
	public String toString() {
		return "User [name=" + name + ", password=************]";
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	

}
