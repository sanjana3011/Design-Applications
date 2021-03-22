package common;

import java.util.Timer;
import java.util.TimerTask;

public class BarkDetector {
	private DogDoor door;
	public BarkDetector(DogDoor door)
	{
		this.door=door;
	}
	public void bark(String bark)
	{
	  if(door.getAllowedBark().equals(bark))
	  {
	  if(door.isOpen())
	  {
		  door.close();
	  }
	  else
	  {
		  door.close();
	  }
	  }	
	}
}
