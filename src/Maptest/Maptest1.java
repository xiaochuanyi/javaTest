package Maptest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Maptest1 {
@Test
public void test1(){
		Map<Integer,User> map=new HashMap<>();
		User user=new User("С��","123",12);
		User user1=new User("С��","124",15);
		map.put(1,user);
		map.put(2, user1);
		User s1=map.get(1);
		User s2=map.get(2);
		System.out.println(s1);
		System.out.println(s2);
	}
}
