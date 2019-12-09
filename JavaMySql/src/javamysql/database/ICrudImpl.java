package javamysql.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

import javamysql.model.User;

public class ICrudImpl  implements ICrud{
	
	private Connection connection;

	@Override
	public boolean insert(User user) {
		return true;
		
	}

	@Override
	public User getUser(String userName, String password) {
		return null;
		
	}
	
	public void openConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc://mysql://localhost:80/java_db", "root", "");
			System.out.println("connectio estableshed");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error"+ e.getMessage());
		}
	}

}
