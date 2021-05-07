package error;

public class NoCoinsException extends RuntimeException {
	private String message;
	
	public NoCoinsException()
	{
		this.message="No coins for change";
	}
	
	public String getMessage() {
		return message;
	}
	
}
