package common;

import java.util.*;

public class Sundae extends Dessert{
    private List<Syrup> syrups;
    public Sundae()
    {
    	super();
    	syrups=new ArrayList<Syrup>();
    }
	public void addSyrup(Syrup syrup)
	{
		syrups.add(syrup);
		
	}
}
