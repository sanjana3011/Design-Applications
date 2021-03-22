package common;

public abstract class InstrumentSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	public InstrumentSpec(Builder builder, String model, Type type,  Wood backWood,
	 Wood topWood )
	{
		this.builder=builder;
		this.backWood=backWood;
		this.topWood=topWood;
		this.model=model;
		this.type=type;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public boolean equals(GuitarSpec guitarSpec)
	{
		return (guitarSpec.getBuilder().equals(this.getBuilder()) &&
				guitarSpec.getModel().equalsIgnoreCase(this.getModel()) &&
				guitarSpec.getType().equals(this.getType()) &&
				guitarSpec.getTopWood().equals(this.getTopWood()) &&
				guitarSpec.getBackWood().equals(this.getBackWood()));
		
	}

}
