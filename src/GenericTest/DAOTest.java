package GenericTest;

public class DAOTest {

	public static void main(String[] args) {
		DAO<User> dao=new DAO<>();
		User user=new User("С��","1", "15");
		dao.save("1",new User("С��", "1", "11"));
		System.out.println(dao.getT("1"));

	}

}