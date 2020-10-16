 

package com.saviynt.ssm.abstractConnector.exceptions;

/**
 * The Class IdentityTypeNotSupportedException.
 */
public class IdentityTypeNotSupportedException extends ConnectorException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    
   
    
    /**
     * Instantiates a new identity type not supported exception.
     */
    public IdentityTypeNotSupportedException() {
        super();
    }

    
    /**
     * Instantiates a new identity type not supported exception.
     *
     * @param message the message
     */
    public IdentityTypeNotSupportedException(String message) {
        super(message);
    }

     
    /**
     * Instantiates a new identity type not supported exception.
     *
     * @param cause the cause
     */
    public IdentityTypeNotSupportedException(Throwable cause) {
        super(cause);
    }

   
    /**
     * Instantiates a new identity type not supported exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public IdentityTypeNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

   
    
    
}
