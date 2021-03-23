package common;

public interface Topping {
	public Top getTopping();
	default void serve() {
		System.out.println(" Serving "+this.getClass().getSimpleName());
	}

}
