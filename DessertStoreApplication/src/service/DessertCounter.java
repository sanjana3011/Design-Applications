package service;

import common.*;

public class DessertCounter {
	public static void main(String[] args)
	{
	DessertOrder order=new DessertOrder();
	IceCream icecream=new Vanilla();
	icecream.serve();
	Topping topping=new Cherry();
	topping.serve();
	Syrup syrup=new Syrup();
	syrup.serve();
	syrup.addIngredient(Ingredient.CARAMEL);
	Sundae sundae=new Sundae();
	sundae.serve();
	sundae.addIceCream(icecream);
	sundae.addSyrup(syrup);
	sundae.addTopping(topping);
	order.addDessert(sundae);
		
	}
	
	
		


}
