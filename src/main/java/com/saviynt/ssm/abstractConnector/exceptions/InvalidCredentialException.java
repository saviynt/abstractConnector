
 
package com.saviynt.ssm.abstractConnector.exceptions;
 
public class InvalidCredentialException extends ConnectorException {

    private static final long serialVersionUID = 1L;

   
    public InvalidCredentialException() {
        super();
    }

    
    public InvalidCredentialException(String message) {
        super(message);
    }
 
    public InvalidCredentialException(Throwable ex) {
        super(ex);
    }

    
    public InvalidCredentialException(String message, Throwable ex) {
        super(message, ex);
    }
}
