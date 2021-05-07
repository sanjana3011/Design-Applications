package common;

public enum Coin {
	NICKLE("Nickle", 5),
	DIME("Dime", 10),
	QUARTER("Quarter", 25),
	CENT("Cent", 1);
	
	Coin(String name, int value) {
		this.Name=name;
		this.value=value;
	}
	private String Name;
	public String getName() {
		return Name;
	}
	public int getValue() {
		return value;
	}
	private int value;
	public String toString()
	{
		return "Coin "+getName()+" -> Value: "+getValue();
	}
	

}
