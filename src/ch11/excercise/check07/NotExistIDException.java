package ch11.excercise.check07;

public class NotExistIDException extends Exception{
	public NotExistIDException() {
	}
	
	public NotExistIDException(String message) {
		super(message);
	}

}
