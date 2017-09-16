package JDBCTest;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;
/*
 * ����JDBC�Ĺ����࣬��װ�˻�ȡ���ӵķ������ͷ����ӵķ���
 */
public class JDBCTools {	
	//�ر�����
	public static void release(Statement statement,Connection connection, ResultSet sr){
		if(sr!=null){
			try {
				sr.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		if(statement!=null){
			try {				
				statement.close();//�ر�����
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
				if(connection!=null){
			try {				
				connection.close();//�ر�����
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			}
		}
	}
			
	//�������ݿ�
	public static Connection connection() throws Exception{
		//1.׼���������ݿ��4���ַ���						
		//����properties����
		Properties properties=new Properties();
		//��ȡjdbc.properties��Ӧ��������
		InputStream in=JDBCTools.class.getClassLoader().getResourceAsStream("jdbc.properties");		
		//���ض�Ӧ��������
		properties.load(in);
		//���������Ӧ���ַ���
		String driver=properties.getProperty("driver");	
		String jdbcUrl=properties.getProperty("jdbcUrl");
		System.out.println(jdbcUrl);
		String user=properties.getProperty("user");
		String password=properties.getProperty("password");
		//�������ݿ���������
		Class.forName(driver);						
		//��ȡ���ݿ�����  ���ַ�������DriverManager���Թ���������������ע���˶�����ݿ����ӣ������getConnection����
		//����Ĳ�����ͬ�������ز�ͬ�����ݿ����ӡ���
		return DriverManager.getConnection(jdbcUrl,user,password);
		//Connection connection=driver.connect(jdbcUrl,info);
		
	}

}