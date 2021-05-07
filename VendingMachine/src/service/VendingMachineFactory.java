package service;

public class VendingMachineFactory {
	public static VendingMachine createVendingMachine() {
		return new MyVendingMachine();
	}

}
