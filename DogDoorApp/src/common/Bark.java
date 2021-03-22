package common;

public class Bark {
	private String dogBark;

	public String getDogBark() {
		return dogBark;
	}

	public void setDogBark(String dogBark) {
		this.dogBark = dogBark;
	}
	public boolean equals(Object bark)
	{
		if(bark instanceof Bark)
		{
			Bark otherBark=(Bark) bark;
			return this.dogBark.equalsIgnoreCase(otherBark.getDogBark());
		}
		return false;
	}
}
