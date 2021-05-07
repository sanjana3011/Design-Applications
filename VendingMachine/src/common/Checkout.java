package common;

import java.util.List;

public class Checkout<T,P> {
	@Override
	public String toString() {
		return "Checkout [product=" + product + ", coins=" + coins + "]";
	}
	private Product product;
	private List<Coin> coins;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public List<Coin> getCoins() {
		return coins;
	}
	public void setCoins(List<Coin> coins) {
		this.coins = coins;
	}

}
