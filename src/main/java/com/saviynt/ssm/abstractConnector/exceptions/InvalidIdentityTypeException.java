 

package com.saviynt.ssm.abstractConnector.exceptions;

/**
 * The Class InvalidIdentityTypeException.
 */
public class InvalidIdentityTypeException extends ConnectorException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    
    

    
    /**
     * Instantiates a new invalid identity type exception.
     */
    public InvalidIdentityTypeException() {
        super();
    }

    
    /**
     * Instantiates a new invalid identity type exception.
     *
     * @param message the message
     */
    public InvalidIdentityTypeException(String message) {
        super(message);
    }

     
    /**
     * Instantiates a new invalid identity type exception.
     *
     * @param cause the cause
     */
    public InvalidIdentityTypeException(Throwable cause) {
        super(cause);
    }

   
    /**
     * Instantiates a new invalid identity type exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public InvalidIdentityTypeException(String message, Throwable cause) {
        super(message, cause);
    }

   
}
