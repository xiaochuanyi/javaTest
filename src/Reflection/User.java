package Reflection;

public class User {
	private String userName;
	private String userId;
	private String age;
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", age=" + age + "]";
	}
	public User() {
		super();
		System.out.println("这是空参构造器");
	}
	
}
