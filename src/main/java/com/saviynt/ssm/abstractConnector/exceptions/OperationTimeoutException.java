
package com.saviynt.ssm.abstractConnector.exceptions;

public class OperationTimeoutException extends ConnectorException {

	private static final long serialVersionUID = 1L;

	public OperationTimeoutException() {
		super();
	}

	public OperationTimeoutException(String msg) {
		super(msg);
	}

	public OperationTimeoutException(Throwable e) {
		super(e);
	}

	public OperationTimeoutException(String msg, Throwable e) {
		super(msg, e);
	}

}
