 

package com.saviynt.ssm.abstractConnector.exceptions;

public class MissingKeyException extends ConnectorException {

    private static final long serialVersionUID = 1L;
    
      
    public MissingKeyException() {
        super();
    }

    
    public MissingKeyException(String message) {
        super(message);
    }

     
    public MissingKeyException(Throwable cause) {
        super(cause);
    }

   
    public MissingKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    
	 
    
}
