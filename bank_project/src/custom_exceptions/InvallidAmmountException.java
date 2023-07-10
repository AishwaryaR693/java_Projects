package custom_exceptions;

public class InvallidAmmountException extends Exception{

	private String message1;

	public InvallidAmmountException(String message1)
	{
		this.message1=message1;

	}

	public String getmessage1()
	{
		return message1;	
	}

}
