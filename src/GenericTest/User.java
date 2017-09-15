package GenericTest;

public class User {
	private String userName;
	private String userId;
	private String age;
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", age=" + age + ", getUserName()=" + getUserName()
				+ ", getUserId()=" + getUserId() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public User(String userName, String userId, String age) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.age = age;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
