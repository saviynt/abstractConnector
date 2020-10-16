
package com.saviynt.ssm.abstractConnector;

import java.util.List;
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
	 * Gets the logon id and session id by client name.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the logon id and session id by client name
	 * @throws ConnectorException the connector exception
	 */
	public String getLogonIdAndSessionIdByClientName(Map<String, Object> configData, Map<String, Object> data)  throws ConnectorException;
   
	/**
	 * Gets the logoff by session id.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the logoff by session id
	 * @throws ConnectorException the connector exception
	 */
	public Boolean getLogoffBySessionId(Map<String, Object> configData, Map<String, Object> data)   throws ConnectorException;
    
	/**
	 * Gets the log off disc sessions.
	 *
	 * @param configData the config data
	 * @return the log off disc sessions
	 * @throws ConnectorException the connector exception
	 */
	public Boolean getLogOffDiscSessions(Map<String, Object> configData) throws ConnectorException;
	
	/**
	 * Display name.
	 *
	 * @return the string
	 */
	public abstract String displayName();

	/**
	 * Version.
	 *
	 * @return the string
	 */
	public abstract String version();

	/**
	 * Test.
	 *
	 * @param configData the config data
	 * @param filterData the filter data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 * @throws InvalidCredentialException the invalid credential exception
	 * @throws InvalidAttributeValueException the invalid attribute value exception
	 * @throws OperationTimeoutException the operation timeout exception
	 * @throws MissingKeyException the missing key exception
	 */
	public abstract Boolean test(Map<String,Object> configData ,Map<String,Object> filterData) throws ConnectorException,InvalidCredentialException, InvalidAttributeValueException, OperationTimeoutException,MissingKeyException;

	/**
	 * Reconsile.
	 *
	 * @param configData the config data
	 * @param filterData the filter data
	 * @param formatterClass the formatter class
	 * @throws ConnectorException the connector exception
	 */
	public abstract void reconsile(Map<String,Object> configData,Map<String, Object> filterData,String formatterClass) throws ConnectorException;
 	 
	/**
	 * Check existing.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @param serachableObject the serachable object
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean checkExisting(Map<String,Object> configData,Map<String,Object> data,SearchableObject serachableObject) throws ConnectorException;
	
	/**
	 * Creates the account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean createAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Account reconcile.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the map
	 * @throws ConnectorException the connector exception
	 */
	public abstract Map<String, List<Map<String, Object>>> accountReconcile(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;

 	/**
	  * Update account.
	  *
	  * @param configData the config data
	  * @param data the data
	  * @return the integer
	  * @throws ConnectorException the connector exception
	  */
	 public abstract Integer updateAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Lock account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean lockAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Disable account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean disableAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
    /**
     * Un lock account.
     *
     * @param configData the config data
     * @param data the data
     * @return the boolean
     * @throws ConnectorException the connector exception
     */
    public abstract Boolean unLockAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Enable account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean enableAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Terminate account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer terminateAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Removes the account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer removeAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
 
	/**
	 * Adds the access to account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer addAccessToAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Removes the access to account.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer removeAccessToAccount(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
 	/**
	  * Change password.
	  *
	  * @param configData the config data
	  * @param data the data
	  * @return the boolean
	  * @throws ConnectorException the connector exception
	  */
	 public abstract Boolean changePassword(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
    /**
     * Creates the user.
     *
     * @param configData the config data
     * @param data the data
     * @return the boolean
     * @throws ConnectorException the connector exception
     */
    public abstract Boolean createUser(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Update user.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer updateUser(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Update entitlement.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the integer
	 * @throws ConnectorException the connector exception
	 */
	public abstract Integer updateEntitlement(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Creates the entitlement.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean createEntitlement(Map<String,Object> configData,Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Validate credentials.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the boolean
	 * @throws ConnectorException the connector exception
	 */
	public abstract Boolean validateCredentials(Map<String,Object> configData, Map<String,Object> data) throws ConnectorException;
	
	/**
	 * Gets the summary.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the summary
	 */
	public abstract  Map<String, Object> getSummary(Map<String,Object> configData, Map<String,Object> data);
	
	/**
	 * Sets the config.
	 *
	 * @param configData the new config
	 */
	public abstract  void setConfig(ConfigDataVo configData);
	
	/**
	 * Gets the config.
	 *
	 * @return the config
	 */
	public abstract  ConfigDataVo getConfig();
    	 
 	/**
	  * Checks if is premises.
	  *
	  * @return the boolean
	  */
	 public Boolean isPremises();
	
}
