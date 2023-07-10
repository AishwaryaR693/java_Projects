package com;

public class InsufficientBalanceException extends RuntimeException {

	private String message;

	InsufficientBalanceException(String message){
		this.message=message;
	}

	public String getmessage() {
		return message;
	}

}
/**
   Rules to work custom exception/User Define Exception
   "======================================================
   1, create a class with a Exception name
   2a) if classs extends  RuntimeException -->unchecked exception
   b) if class extends  Exception-->Checked exception
   3, Override getmessage() -->(variable, consoctor,method)
   4, invoke the exception obk=ject using throw keyword
   handalle it using try & catch block suitable message
 */
