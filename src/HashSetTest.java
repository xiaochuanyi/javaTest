package week;

import java.util.HashSet;
import java.util.Iterator;

/*
 * ����һ��Oerson�ഴ���������ڴ����HashSet��
 */
 class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getname(){
		return this.name;
	}
	public int getage(){
		return this.age;
	}
	/*
	 * ��д��hashCode�������᷵��Ԫ�ص�hashֵ��������Ԫ��hashֵ��ͬʱ�������equals��������Ȼ������á�
	 * 
	 */
	public int hashCode(){
		return name.hashCode()+age;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Person))
			return false;
		Person p=(Person)obj;
		System.out.println(this.name+"equals"+p.name);
		return this.name.equals(p.name) && this.age==p.age;
	}
}
public class HashSetTest{
	/*
	 * ����һ����̬����sopȥ��������Ķ�����
	 */
	public static void sop(Object obj){
	   System.out.println(obj);
	}
 public static void main(String[] args) {
	HashSet a=new HashSet();
	a.add(new Person("С��",11));
	a.add(new Person("С��",11));
	a.add(new Person("С��",12));
	a.add(new Person("С��",13));//����HashSet���϶��󣬴�������Person����
for(Iterator it=a.iterator();it.hasNext();){
	Person p=(Person)it.next();//����һ��Person����ָ��it.next���Ұ�it.nextǿתΪperson��
	sop(p.getname()+p.getage());
}
}

}