package common;

public interface IceCream {
	public Taste getTaste();
	default void serve() {
		System.out.println(" Serving "+this.getClass().getSimpleName());
	}
	
}
