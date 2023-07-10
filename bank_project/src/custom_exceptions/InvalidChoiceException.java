package custom_exceptions;

public class InvalidChoiceException extends Exception 
{
	private String message;

	public InvalidChoiceException(String message) {
		this.message=message;
	}

	public String getmessage()
	{
		return message;
	}

}
