package com.saviynt.ssm.abstractConnector.exceptions;

/**
 * The Class InvalidFormatException.
 */
public class InvalidFormatException extends ConnectorException{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
    
    
    /**
     * Instantiates a new invalid format exception.
     */
    public InvalidFormatException() {
        super();
    }

    
    /**
     * Instantiates a new invalid format exception.
     *
     * @param message the message
     */
    public InvalidFormatException(String message) {
        super(message);
    }

     
    /**
     * Instantiates a new invalid format exception.
     *
     * @param cause the cause
     */
    public InvalidFormatException(Throwable cause) {
        super(cause);
    }

   
    /**
     * Instantiates a new invalid format exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public InvalidFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    

}
