package common;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
	private DogDoor door;
	public Remote(DogDoor door)
	{
		this.door=door;
	}
	
	public void press()
	{
	  if(door.isOpen())
	  {
		  door.close();
	  }
	  else
	  {
		  door.open();
	  }
		
	}
	
}
