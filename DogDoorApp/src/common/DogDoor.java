package common;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean door;
	private Bark[] allowedBarks;
	public DogDoor()
	{
		this.door=false;
		allowedBarks=new Bark[100];
	}

	public void open()
	{
		this.door=true;
		final Timer timer=new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				door=false;
				timer.cancel();
				System.out.println("Door closed");
			}	
		}, (long)5000);
	}
	public void close()
	{
		this.door=false;
	}
	public boolean isOpen()
	{
		return door;
	}
	public void setAllowedBark(String bark)
	{
		Bark newbark=new Bark();
		newbark.setDogBark(bark);
		
	}
	public Bark[] getAllowedBark()
	{
		return this.allowedBarks;
	}

}
