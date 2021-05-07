package service;

import java.util.*;
import common.Checkout;
import common.Coin;
import common.Inventory;
import common.Product;
import error.InsufficientAmountException;
import error.NoCoinsException;

public class MyVendingMachine implements VendingMachine {
    Inventory<Product> productInventory;
    Inventory<Coin> cashInventory;
    private String machineName;
    private int capacity;
    private Product currentProduct;
    private double currentMoney;
    public MyVendingMachine() {
    	this.machineName="My Vending Machine";
    	this.capacity=100;
    	productInventory=new Inventory<Product>();
    	cashInventory=new Inventory<Coin>();
    }
	public String getMachineName() {
		return machineName;
	}
	public int getCapacity() {
		return capacity;
	}

	@Override
	public void displayAllProducts() {
		System.out.println(getMachineName());
		Map<Product, Integer> mp=productInventory.getInventory();
		mp.forEach((key, value) -> System.out.println("Product: "+key.getName()+" Price: "+key.getPrice()+" Quantity: "+value));
		
	}

	@Override
	public void addCoin(Coin coin) {
		currentMoney+=coin.getValue();
	}

	@Override
	public double selectProductandgetPrice(Product product) {
		currentProduct=product;
		currentMoney=0;
		return product.getPrice();
	}

	public double changeCollected() throws InsufficientAmountException
	{
		double change=currentMoney-currentProduct.getPrice();
		if(change<0)
		{
			throw new InsufficientAmountException("Insuffecient Amount. Add more coins", change);
		}
		return change;	
	}
	@Override
	public Checkout<Product, List<Coin> > getProductandChange() {
		Checkout<Product, List<Coin> > obj=new Checkout<Product, List<Coin>>();
		try {
			obj.setCoins(getChange(changeCollected()));
			obj.setProduct(currentProduct);
			productInventory.removeItem(currentProduct);
		}
		catch(NoCoinsException | InsufficientAmountException ex) {
			System.out.println(ex.getMessage());
		}
		return obj;
	}
	
	public List<Coin> getChange(double change) throws NoCoinsException
	{
		List<Coin> coins=new ArrayList<Coin>();
		while(change>0)
		{
			if(change>=Coin.QUARTER.getValue() && cashInventory.hasItem(Coin.QUARTER))
			{
				coins.add(Coin.QUARTER);
				cashInventory.removeItem(Coin.QUARTER);
				change=change-Coin.QUARTER.getValue();
				continue;
			}
			else if(change>=Coin.DIME.getValue() && cashInventory.hasItem(Coin.DIME))
			{
				coins.add(Coin.DIME);
				cashInventory.removeItem(Coin.DIME);
				change=change-Coin.DIME.getValue();
				continue;
			}
			else if(change>=Coin.NICKLE.getValue() && cashInventory.hasItem(Coin.NICKLE))
			{
				coins.add(Coin.NICKLE);
				cashInventory.removeItem(Coin.NICKLE);
				change=change-Coin.NICKLE.getValue();
				continue;
			}
			else if(change>=Coin.CENT.getValue() && cashInventory.hasItem(Coin.CENT))
			{
				coins.add(Coin.CENT);
				cashInventory.removeItem(Coin.CENT);
				change=change-Coin.CENT.getValue();
				continue;
			}
			else
			{
				throw new NoCoinsException();
			}		
		}
		return coins;
	}

	@Override
	public void refillMachine() {
		productInventory.reset();
		cashInventory.reset();
		cashInventory.putitem(Coin.CENT,10);
		cashInventory.putitem(Coin.DIME,2);
		cashInventory.putitem(Coin.NICKLE,2);
		cashInventory.putitem(Coin.QUARTER,1);
		productInventory.putitem(Product.CANDY,2);
		productInventory.putitem(Product.CHOCOLATE,2);
		productInventory.putitem(Product.COKE,2);
		productInventory.putitem(Product.SODA,2);

		
	}

	
	

}
