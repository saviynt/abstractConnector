package com.saviynt.ssm.abstractConnector.exceptions;

public class ObjectExistInTargetException extends ConnectorException {

	private static final long serialVersionUID = 1L;

	public ObjectExistInTargetException() {
		super();
	}

	public ObjectExistInTargetException(String message) {
		super(message);
	}

	public ObjectExistInTargetException(Throwable ex) {
		super(ex);
	}

	public ObjectExistInTargetException(String message, Throwable ex) {
		super(message, ex);
	}

}
