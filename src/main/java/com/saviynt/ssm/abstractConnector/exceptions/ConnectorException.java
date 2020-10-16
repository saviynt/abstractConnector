
package com.saviynt.ssm.abstractConnector.exceptions;

/**
 * The Class ConnectorException.
 */
public class ConnectorException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new connector exception.
	 */
	public ConnectorException() {
		super();
	}

	/**
	 * Instantiates a new connector exception.
	 *
	 * @param message the message
	 */
	public ConnectorException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new connector exception.
	 *
	 * @param originalException the original exception
	 */
	public ConnectorException(Throwable originalException) {
		super(originalException);
	}

	/**
	 * Instantiates a new connector exception.
	 *
	 * @param message the message
	 * @param originalException the original exception
	 */
	public ConnectorException(String message, Throwable originalException) {
		super(message, originalException);
	}

	/**
	 * Rethrow.
	 *
	 * @throws Throwable the throwable
	 */
	public void rethrow() throws Throwable {
		throw (getCause() == null) ? this : getCause();
	}

	/**
	 * Wrap.
	 *
	 * @param ex the ex
	 * @return the runtime exception
	 */
	public static RuntimeException wrap(Throwable ex) {

		if (ex instanceof Error) {
			throw (Error) ex;
		}

		if (ex instanceof RuntimeException) {
			return (RuntimeException) ex;
		}
		return new ConnectorException(ex);
	}
}
