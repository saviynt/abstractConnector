 

package com.saviynt.ssm.abstractConnector.exceptions;

/**
 * The Class InvalidAttributeValueException.
 */
public class InvalidAttributeValueException extends ConnectorException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
       
    /**
     * Instantiates a new invalid attribute value exception.
     */
    public InvalidAttributeValueException() {
        super();
    }

    
    /**
     * Instantiates a new invalid attribute value exception.
     *
     * @param message the message
     */
    public InvalidAttributeValueException(String message) {
        super(message);
    }

     
    /**
     * Instantiates a new invalid attribute value exception.
     *
     * @param cause the cause
     */
    public InvalidAttributeValueException(Throwable cause) {
        super(cause);
    }

   
    /**
     * Instantiates a new invalid attribute value exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public InvalidAttributeValueException(String message, Throwable cause) {
        super(message, cause);
    }

    
	 
    
}
