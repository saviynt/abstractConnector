
 
package com.saviynt.ssm.abstractConnector.exceptions;
 
/**
 * The Class InvalidCredentialException.
 */
public class InvalidCredentialException extends ConnectorException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

   
    /**
     * Instantiates a new invalid credential exception.
     */
    public InvalidCredentialException() {
        super();
    }

    
    /**
     * Instantiates a new invalid credential exception.
     *
     * @param message the message
     */
    public InvalidCredentialException(String message) {
        super(message);
    }
 
    /**
     * Instantiates a new invalid credential exception.
     *
     * @param ex the ex
     */
    public InvalidCredentialException(Throwable ex) {
        super(ex);
    }

    
    /**
     * Instantiates a new invalid credential exception.
     *
     * @param message the message
     * @param ex the ex
     */
    public InvalidCredentialException(String message, Throwable ex) {
        super(message, ex);
    }
}
