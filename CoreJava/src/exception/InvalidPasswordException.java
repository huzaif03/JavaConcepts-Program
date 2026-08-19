package exception;

public class InvalidPasswordException extends Exception{
	public String message;
	InvalidPasswordException(String message){
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
