package service;

import common.Coin;
import common.Product;

public class VendingTest {
	public static void main(String[] args) {
		VendingMachineFactory factory=new VendingMachineFactory();
		VendingMachine machine=factory.createVendingMachine();
		machine.refillMachine();
		machine.displayAllProducts();
		System.out.println(machine.selectProductandgetPrice(Product.CHOCOLATE));
		machine.addCoin(Coin.QUARTER);
		System.out.println(machine.getProductandChange().toString());
	}

}
