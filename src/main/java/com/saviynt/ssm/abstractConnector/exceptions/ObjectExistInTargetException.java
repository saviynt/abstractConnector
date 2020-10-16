package com.saviynt.ssm.abstractConnector.exceptions;

/**
 * The Class ObjectExistInTargetException.
 */
public class ObjectExistInTargetException extends ConnectorException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new object exist in target exception.
	 */
	public ObjectExistInTargetException() {
		super();
	}

	/**
	 * Instantiates a new object exist in target exception.
	 *
	 * @param message the message
	 */
	public ObjectExistInTargetException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new object exist in target exception.
	 *
	 * @param ex the ex
	 */
	public ObjectExistInTargetException(Throwable ex) {
		super(ex);
	}

	/**
	 * Instantiates a new object exist in target exception.
	 *
	 * @param message the message
	 * @param ex the ex
	 */
	public ObjectExistInTargetException(String message, Throwable ex) {
		super(message, ex);
	}

}
