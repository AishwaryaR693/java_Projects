package CustomeExceptions;

public class InvalidchoiceException  extends RuntimeException{


	 private String message; 
	   
		public InvalidchoiceException(String message) {
			this.message=message;
		}
		
		public String getmessage() {
			return message;
		}
	

	
}
