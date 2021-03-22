package common;

public abstract class Instrument {
	private String serialNumber;
	private double price;
	private InstrumentSpec instrumentSpec;
	public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
		this.serialNumber=serialNumber;
		this.price=price;
		this.instrumentSpec=instrumentSpec;
	}
	public String getSerialNumber() {
		return this.serialNumber;
	}
	public double getPrice() {
		return this.price;
	}
	public InstrumentSpec getInstrumentSpec() {
		return this.instrumentSpec;
	}
	public void setInstrumentSpec(InstrumentSpec instrumentSpec) {
		this.instrumentSpec=instrumentSpec;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber=serialNumber;
	}
	public void setPrice(double price) {
		this.price=price;
	}

}
