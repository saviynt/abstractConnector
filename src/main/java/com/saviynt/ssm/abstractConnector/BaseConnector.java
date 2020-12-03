package com.saviynt.ssm.abstractConnector;

import java.util.Map;

import com.saviynt.ssm.abstractConnector.exceptions.ConnectorException;
import com.saviynt.ssm.abstractConnector.exceptions.InvalidAttributeValueException;
import com.saviynt.ssm.abstractConnector.exceptions.InvalidCredentialException;
import com.saviynt.ssm.abstractConnector.exceptions.MissingKeyException;
import com.saviynt.ssm.abstractConnector.exceptions.OperationTimeoutException;

 
/**
 * The Interface BaseConnector.
 */
interface BaseConnector {
	
	/**
	 * to get the logon id and session id by client name
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the logon id and session id by client name
	 * @throws ConnectorException the connector exception
	 */
	public String getLogonIdAndSessionIdByClientName(Map<String, Object> configData, Map<String, Object> data)  throws ConnectorException;
   
	/**
	 * to get the logoff by session id
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the logoff by session id
	 * @throws ConnectorException the connector exception
	 */
	public Boolean getLogoffBySessionId(Map<String, Object> configData, Map<String, Object> data)   throws ConnectorException;
    
	/**
	 * to get the log off disc sessions
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @return the log off disc sessions
	 * @throws ConnectorException the connector exception
	 */
	public Boolean getLogOffDiscSessions(Map<String, Object> configData) throws ConnectorException;
	
	/**
	 *  to retrieve connector display name
	 *
	 * @return the string
	 */
	public abstract String displayName();

	/**
	 * to retrieve connector version
	 *
	 * @return the string
	 */
	public abstract String version();

	/**
	 * to test the connection
	 * Example : To test the connection , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to target system using JDBC connection
	 * step 3 : return true if connection is successful
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the boolean true or false
	 * @throws ConnectorException the connector exception
	 * @throws InvalidCredentialException the invalid credential exception
	 * @throws InvalidAttributeValueException the invalid attribute value exception
	 * @throws OperationTimeoutException the operation timeout exception
	 * @throws MissingKeyException the missing key exception
	 */
	public abstract Boolean test(Map<String,Object> configData ,Map<String,Object> data) throws ConnectorException,InvalidCredentialException, InvalidAttributeValueException, OperationTimeoutException,MissingKeyException;
	 
	/**
	 * to check existing record for the input object
	 * Example : to check existing record for the input object(for account) , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : set the data with filters if any
	 * step 3 : call getObjectList
	 * step 4 : return true if object exists
	 * 
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection

	 * @param serachableObject for serachableObject
	 * @return the boolean true or false
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean checkExisting(Map<String,Object> configData,Map<String,Object> data,SearchableObject serachableObject) throws ConnectorException;
	
	/**
	 * to process reconcile for users and accounts
	 * Example : to process reconcile for users and accounts , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : collect the data(Account,Users,Entitlements) from target system
	 * step 3 : set the data into the format accepted by connector framework's notify
	 * step 4 : call connector framework's notify method 
	 * 
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
     * @param formatterClass the formatter class
	 * @throws ConnectorException the connector exception
	 */
	public abstract void reconcile(Map<String,Object> configData,Map<String, Object> data,String formatterClass) throws ConnectorException;

	/**
	 * to create account in the target system 
	 * Example : to create account in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to create account in the target system
	 * step 4 : return true if successful
	 * 
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the boolean true or false
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean createAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to update account in the target system
	 * Example : to update account in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to update account in the target system
	 * step 4 : return the number of records updated
	 * 
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the integer number of accounts updated
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer updateAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to lock the account in target system
	 * Example : to lock account in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to lock account in the target system
	 * step 4 : return true if successful
	 * 
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the boolean true or false
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean lockAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to disable account in the target system
	 * Example : to disable account in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to disable account in the target system
	 * step 4 : return true if successful
	 * 
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the boolean true or false
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean disableAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to unlock account in the target system
	 * Example : to disable account in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to disable account in the target system
	 * step 4 : return true if successful
	 * 
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the boolean true or false
	 * @throws ConnectorException the connector exception
	 */
    public abstract Boolean unLockAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
    /**
     * to enable account in the target system
	 * Example : to enable account in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to enable account in the target system
	 * step 4 : return true if successful
	 * 
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the boolean true or false
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean enableAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to terminate account in the target system
	 * Example : to terminate account in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to terminate account in the target system
	 * step 4 : return the number of records updated
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the integer number of accounts terminated
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer terminateAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to remove account in the target system
	 * Example : to remove account in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to remove account in the target system
	 * step 4 : return true if successful
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the integer number of accounts removed
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer removeAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
 

	/**
	 * to add access to account in the target system
	 * Example : to add access to account in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to add access to account in the target system
	 * step 4 : return the number of records updated
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the integer access granted count
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer addAccessToAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to remove access to account in the target system
	 * Example : to remove access to account in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to remove access to account in the target system
	 * step 4 : return true if successful
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer removeAccessToAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to change password in the target system
	 * Example : to change password in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to change password in the target system
	 * step 4 : return true if successful
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the boolean true or false
	 * @throws ConnectorException the connector exception
	 */
	 public abstract Boolean changePassword(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
    /**
     * to create user in the target system
	 * Example : to create user in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to create user in the target system
	 * step 4 : return true if successful
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the boolean true or false
	 * @throws ConnectorException the connector exception
     */
    public abstract Boolean createUser(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
    /**
	 * to update user in the target system
	 * Example : to update user in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to update user in the target system
	 * step 4 : return the number of records updated
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer updateUser(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to update the entitlement in target system
	 * Example : to update entitlement in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to update entitlement in the target system
	 * step 4 : return the number of records updated
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer updateEntitlement(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to create the entitlement in target system
	 * Example : to create entitlement in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to create entitlement in the target system
	 * step 4 : return true if successful
	 * 
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the boolean true or false
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean createEntitlement(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to validate credentials of the given input from connection
	 * Example : to validate credentials in the target system , refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : connect to the target system
	 * step 3 : execute the query/process the required input to validate credentials in the target system
	 * step 4 : return true if successful
	 * 
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the boolean true or false
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean validateCredentials(Map<String,Object> configData, Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to get the summary of number of records for the given input object such as account
	 * Example : to get the summary of number of records for the given input object such as account, refer to the below steps
	 * step 1 : retrieve connection attributes from configData/Data
	 * step 2 : set the data with filters if any
	 * step 3 : call getObjectList
	 * 
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 * @param data       In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
	 *                   sampleconntype) connection attributes are defined for  different tasks such as reconciliation,
	 *                   provisioning(createaccount,addaccesstoaccount etc) in the form of JSON's(Example:ReconcileJSON,addAccesstToAccountJSON) for the selected sampleconnector.Upon having
	 *                   a connection Type for sampleconnector, a new connection is to be created.At the time of creating a new connection,
	 *                   ConnectionType(Example:sampleconntype) is chosen and connection attributes are dynamically populated. These
	 *                   connection attributes need to be inputed with relative data.For Example, ReconcileJSON need to be inputed with
	 *                   objects Users,Account,Entitlement (Example: "ACCOUNT" : [ { "saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 * 					"ACCOUNT_ATTRIBUTES" : [ {"saviyntproperty": "Inputsaviyntproperty", "sourceproperty": "${Inputsourceproperty}" } ],
	 *                   "USERS" : [ "saviyntproperty": "Inputsaviyntproperty","sourceproperty": "${Inputsourceproperty}" } ], "ENTITLEMENT" : [ {"saviyntproperty": "Inputsaviyntproperty",
	 *                   "sourceproperty": "${Inputsourceproperty}" } ] data holds all these inputed details of JSON attributes from connection
	 * @return the summary map with object and count as key ,value 
	 */
	public abstract  Map<String, Object> getSummary(Map<String,Object> configData, Map<String,Object> data);
	
	/**
	 * to set the config with attributes needed for creating a connection in SSM.
	 * The attributes defined in setConfig are the attributes that would dynamically
	 * populate on connection creation under SSM
	 *
	 * @param configData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name: sampleconntype) connection attributes are defined for the
	 *                   target connection information such as system url,username,password etc and other system configuration  attributes such as ECM_INSTANCE_URL
	 *                   ,ECM_INSTANCE_SERVICE_ACCOUNT_NAME,ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD,STATUSKEYJSON, STATUS_THRESHOLD_CONFIG_JSON(Example :'statusColumn':'customproperty30','activeStatus':
	 *                   ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateAccountsNotInFile':false}
	 *                   ) for the selected sampleconnector.Upon having a connection Type for sampleconnector, a new connection is to be
	 *                   created.At the time of creating a new connection, ConnectionType(Example:sampleconntype) is chosen and
	 *                   connection attributes are dynamically populated. These connection attributes need to be inputed with relative data
	 *                   for target connection information and other system configuration attributes. configData holds all these
	 *                   inputed details of target connection and system configuration.
	 */
	public abstract  void setConfig(ConfigDataVo configData);
	
	/**
	 * to get the connection attributes configured using setConfig when creating a connection
	 *
	 * @return the new config for input connection attributes from connection created
	 */
	public abstract  ConfigDataVo getConfig();
    	 
 	/**
	  * to checks if is premises
	  *
	  * @return the boolean true or false
	  */
	 public Boolean isPremises();
	
}
