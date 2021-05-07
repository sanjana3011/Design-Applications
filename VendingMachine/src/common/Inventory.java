package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory<T> {
	private Map<T, Integer> inventory;

	public Inventory() {
		inventory=new HashMap<T, Integer>();
	}
	public Map<T, Integer> getInventory() {
		return inventory;
	}

	public void addItem(T item)
	{
		if(inventory.containsKey(item))
		{
			inventory.put(item, inventory.get(item)+1);
		}
		else
		{
			inventory.put(item, 1);
		}	
	}
	public void removeItem(T item)
	{
		if(inventory.containsKey(item))
		{
			inventory.put(item, inventory.get(item)-1);
			if(inventory.get(item)<=0)
			{
				inventory.remove(item);
			}
		}
	}
	
	public boolean hasItem(T item)
	{
		return inventory.containsKey(item);
	}
	
	public void reset()
	{
		inventory.clear();
	}
	
	public void putitem(T item, int quantity)
	{
		inventory.put(item, quantity);
	}
	

}
