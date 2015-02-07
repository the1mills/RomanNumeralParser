package start;

public class NotEnoughArguments extends Exception {

	public NotEnoughArguments() {
		this.printStackTrace();
	}

	public NotEnoughArguments(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughArguments(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughArguments(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughArguments(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
