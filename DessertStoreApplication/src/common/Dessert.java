package common;

import java.util.ArrayList;
import java.util.List;

public abstract class Dessert {
	private List<IceCream> icecreams;
	private List<Topping> toppings;
	public Dessert()
	{
		icecreams=new ArrayList<IceCream>();
		toppings=new ArrayList<Topping>();
	}
	public void serve() {
		System.out.println(" Serving "+this.getClass().getSimpleName());
	}

	public void addIceCream(IceCream icecream) {
		icecreams.add(icecream);
		
	}

	public void addTopping(Topping topping) {
		toppings.add(topping);
		
	}
	

}
