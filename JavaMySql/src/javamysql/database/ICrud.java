package javamysql.database;

import javamysql.model.User;

public interface ICrud {
	
	// insertion of values
	
	boolean insert(User user);
	User getUser(String userName, String password);
	

}
