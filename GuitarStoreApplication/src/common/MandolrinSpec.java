package common;

public class MandolrinSpec extends InstrumentSpec {
	private String style;

	public MandolrinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, String style) {
		super(builder, model, type, backWood, topWood);
		this.style=style;
		// TODO Auto-generated constructor stub
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	public boolean equals(MandolrinSpec mandolrinSpec)
	{
		return super.equals(mandolrinSpec) && mandolrinSpec.getStyle().equals(this.style);
	}

}
