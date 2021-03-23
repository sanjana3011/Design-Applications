package service;

import java.util.*;

import common.*;

public class DessertOrder {
	List<Dessert> order;
	
	public DessertOrder()
	{
		order=new ArrayList<Dessert>();
	}
	
	public void addDessert(Dessert dessert)
	{
		order.add(dessert);
	}
	
	public List<Dessert> getOrder()
	{
		return this.order;
	}

}
