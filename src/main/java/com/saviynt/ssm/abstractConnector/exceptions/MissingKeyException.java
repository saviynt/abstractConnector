 

package com.saviynt.ssm.abstractConnector.exceptions;

/**
 * The Class MissingKeyException.
 */
public class MissingKeyException extends ConnectorException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
      
    /**
     * Instantiates a new missing key exception.
     */
    public MissingKeyException() {
        super();
    }

    
    /**
     * Instantiates a new missing key exception.
     *
     * @param message the message
     */
    public MissingKeyException(String message) {
        super(message);
    }

     
    /**
     * Instantiates a new missing key exception.
     *
     * @param cause the cause
     */
    public MissingKeyException(Throwable cause) {
        super(cause);
    }

   
    /**
     * Instantiates a new missing key exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public MissingKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    
	 
    
}
