 

package com.saviynt.ssm.abstractConnector.exceptions;

public class IdentityTypeNotSupportedException extends ConnectorException {

    private static final long serialVersionUID = 1L;
    
    
   
    
    public IdentityTypeNotSupportedException() {
        super();
    }

    
    public IdentityTypeNotSupportedException(String message) {
        super(message);
    }

     
    public IdentityTypeNotSupportedException(Throwable cause) {
        super(cause);
    }

   
    public IdentityTypeNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

   
    
    
}
