package service;

import java.util.Timer;
import java.util.TimerTask;

import common.*;

public class checkRemote {
	public static void main(String[] args)
	{
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		BarkDetector barkdetector=new BarkDetector(door);
		System.out.println("Dog wants to go out");
		System.out.println("Dog barks");
		barkdetector.bark("AAA");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Door wants to come back. Barks");
		barkdetector.bark("AAA");
		System.out.println("Dog in");

	}

}
