package Generic;

public class Student<T> {
private String name;
private String id;
private T t;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public T getT() {
	return t;
}
public void setT(T t) {
	this.t = t;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", t=" + t + "]";
}

}
