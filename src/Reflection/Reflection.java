package Reflection;

import org.junit.Test;

public class Reflection {
@Test
public void test() throws Exception{
	try {
		String className="Reflection.User";
		Class clazz= Class.forName(className);
		Object obj=clazz.newInstance();
		User user=(User) obj;
		System.out.println(user);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}


}
