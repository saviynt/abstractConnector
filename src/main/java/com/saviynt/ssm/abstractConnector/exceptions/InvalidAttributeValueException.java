 

package com.saviynt.ssm.abstractConnector.exceptions;

public class InvalidAttributeValueException extends ConnectorException {

    private static final long serialVersionUID = 1L;
    
       
    public InvalidAttributeValueException() {
        super();
    }

    
    public InvalidAttributeValueException(String message) {
        super(message);
    }

     
    public InvalidAttributeValueException(Throwable cause) {
        super(cause);
    }

   
    public InvalidAttributeValueException(String message, Throwable cause) {
        super(message, cause);
    }

    
	 
    
}
