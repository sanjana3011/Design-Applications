package common;

public enum Product {
	CHOCOLATE("Chocolate", 10),
	SODA("Soda", 25),
	CANDY("Candy", 30),
	COKE("Coke", 35);

	private Product(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String toString()
	{
		return "Product "+getName()+" -> Cost: "+getPrice();
	}
}
