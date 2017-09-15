package Generic;

import org.junit.Test;

public class generic1 {
@Test
public void test1(){
	Student<Boolean> student=new Student<>();
	student.setId("11");
	student.setName("Ñİ¼¼°É");
	student.setT(false);
	System.out.println(student);
}
@Test
public void test2(){
	int a[]={1,2,3,4,5};
	for(int a1:a){
		System.out.println(a1);
	}
}
}
