package error;

public class InsufficientAmountException extends RuntimeException {
	private String message;
	private double remianing;
	
	public InsufficientAmountException(String message, double amount)
	{
		this.message=message;
		this.remianing=amount;
	}
	
	public String getMessage() {
		return message;
	}
	
	public double getRemaining()
	{
		return remianing;
	}
	
}
