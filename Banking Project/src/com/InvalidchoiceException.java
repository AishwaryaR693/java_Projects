package com;

public class InvalidchoiceException extends Exception {
	private String  message;


	InvalidchoiceException(String message){
		this.message=message;
	}

	public String getmessage() {
		return message;
	}

}
