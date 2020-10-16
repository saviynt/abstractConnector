
package com.saviynt.ssm.abstractConnector.exceptions;

/**
 * The Class OperationTimeoutException.
 */
public class OperationTimeoutException extends ConnectorException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new operation timeout exception.
	 */
	public OperationTimeoutException() {
		super();
	}

	/**
	 * Instantiates a new operation timeout exception.
	 *
	 * @param msg the msg
	 */
	public OperationTimeoutException(String msg) {
		super(msg);
	}

	/**
	 * Instantiates a new operation timeout exception.
	 *
	 * @param e the e
	 */
	public OperationTimeoutException(Throwable e) {
		super(e);
	}

	/**
	 * Instantiates a new operation timeout exception.
	 *
	 * @param msg the msg
	 * @param e the e
	 */
	public OperationTimeoutException(String msg, Throwable e) {
		super(msg, e);
	}

}
