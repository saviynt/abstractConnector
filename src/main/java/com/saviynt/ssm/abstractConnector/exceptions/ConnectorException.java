
package com.saviynt.ssm.abstractConnector.exceptions;

public class ConnectorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ConnectorException() {
		super();
	}

	public ConnectorException(String message) {
		super(message);
	}

	public ConnectorException(Throwable originalException) {
		super(originalException);
	}

	public ConnectorException(String message, Throwable originalException) {
		super(message, originalException);
	}

	public void rethrow() throws Throwable {
		throw (getCause() == null) ? this : getCause();
	}

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
