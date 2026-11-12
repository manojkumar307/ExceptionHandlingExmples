package ExceptionHandling;

public class InvalidPinException extends Exception {
	@Override
	public String getMessage() {
		return "Check the pin you have entered";
	}
}
