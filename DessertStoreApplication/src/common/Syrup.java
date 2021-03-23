package common;

import java.util.*;

public class Syrup {	
	List<Ingredient> ingredients;
	public Syrup()
	{
		ingredients=new ArrayList<Ingredient>();
	}
	
	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}

	
	public List<Ingredient>  getIngredients() {
		return ingredients;
	}

	public void serve() {
		System.out.println("Serving Syrup");
		
	}
	
}
