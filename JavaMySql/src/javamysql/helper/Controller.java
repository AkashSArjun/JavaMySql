package javamysql.helper;

import javamysql.database.ICrudImpl;

public class Controller {
	
	private static Controller controller;
	private ICrudImpl iCrudImpl;
	
	
	private Controller()
	{
		
		this.iCrudImpl = new ICrudImpl();
		this.iCrudImpl.openConnection();
		
	}
	public static Controller getController()
	{
		if (controller == null)
		{
			 controller = new Controller();
			
		}
		return controller;
	}

}
