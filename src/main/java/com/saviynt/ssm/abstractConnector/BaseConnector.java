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
	 * @param configData the config data for target connection information and other system configuration attributes such as version,status threshold
	 * @param data the data for the data objects such as users,account etc from connection
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
	 * @param filterData In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
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
	public abstract Boolean test(Map<String,Object> configData ,Map<String,Object> filterData) throws ConnectorException,InvalidCredentialException, InvalidAttributeValueException, OperationTimeoutException,MissingKeyException;

	/**
	 * to process reconcile for users and accounts
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
	 * @param filterdata In Saviynt Security Manager(SSM/ECM),when creating a new ConnectionType(Example: ConnectionType name:
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
	public abstract void reconcile(Map<String,Object> configData,Map<String, Object> filterData,String formatterClass) throws ConnectorException;
 	 
	/**
	 * to check existing record for the input object.
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
	 * to create the account in target system
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
	 * to update the account in target system
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
	 * to disable the account in target system
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
	 * to unlock the account in target system
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
	 * to enable the account in target system
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
	 * to terminate the account in target system
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
	 * to remove the account in target system
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
	 * to add access to the account in target system
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
	 * to remove the account access in target system
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
	 * to change the password in target system
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
     * to create the user in target system
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
	 * to update the user in target system
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
	 *
	 * @param configData the config data for target connection information and other system configuration attributes such as version,status threshold
	 * @param data the data for the data objects such as users,account etc from connection
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer updateEntitlement(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * to create the entitlement in target system
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
	 * to get the summary of number of records for the given input object such as accounts
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
