package service;

import java.util.Arrays;
import java.util.List;

import common.*;

public interface VendingMachine {	
	public abstract void displayAllProducts();
	public abstract void addCoin(Coin coin);
	public abstract double selectProductandgetPrice(Product product);
	public abstract Checkout<Product, List<Coin> > getProductandChange();
	public abstract void refillMachine();
	
}
