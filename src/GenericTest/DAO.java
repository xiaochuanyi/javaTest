package GenericTest;

import java.util.HashMap;
import java.util.Map;

public class DAO <T>{
	Map<String,T> map=new HashMap<>();
	public void save(String id, T entity ){
		map.put(id, entity);
	}
	public T getT(String id){
		return map.get(id);
	}
}
