 

package com.saviynt.ssm.abstractConnector.exceptions;

public class InvalidIdentityTypeException extends ConnectorException {

    private static final long serialVersionUID = 1L;
    
    
    

    
    public InvalidIdentityTypeException() {
        super();
    }

    
    public InvalidIdentityTypeException(String message) {
        super(message);
    }

     
    public InvalidIdentityTypeException(Throwable cause) {
        super(cause);
    }

   
    public InvalidIdentityTypeException(String message, Throwable cause) {
        super(message, cause);
    }

   
}
