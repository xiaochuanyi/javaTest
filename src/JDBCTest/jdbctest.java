package JDBCTest;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.Test;


public class jdbctest {
	@Test
 public void test1(){ 
	 Connection conn=null;
	 PreparedStatement preparedStatement=null;
	 try {
		conn=JDBCTools.connection();
		String sql="insert into cumstomers values (?,?,?)";
		preparedStatement=conn.prepareStatement(sql);
		preparedStatement.setString(1, "С��");
		preparedStatement.setInt(2, 8);
		preparedStatement.setInt(3, 18);
		preparedStatement.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		JDBCTools. release(preparedStatement, conn, null);
	}
 }
	/*
	 * Object ... args ������Դ��������������
	 * ��Ϊ��������Ϣ�����ǲ��������в�ȷ����
	 */
public void update(String sql,Object ... args){
	 Connection conn=null;
	 PreparedStatement preparedStatement=null;
	 try {
		 conn=JDBCTools.connection();
		 preparedStatement=conn.prepareStatement(sql);
		 for(int i=0;i<args.length;i++){			
			 preparedStatement.setObject(i+1, args[i]);//����forѭ����ѭ���Ĳ�����˵�������ֵ
		 }
		 preparedStatement.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		JDBCTools.release(preparedStatement,conn,null);
		//�ر�����
	}
}
@Test
public void test(){
	String sql="insert into student value (?,?,?,?)";
	update(sql,"12345687","xcy",21,"��Ϣ��ȫ");
	//������԰ɴ��������д��scanner���Լ��ֶ�����
}
}
