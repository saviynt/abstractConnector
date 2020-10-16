package com.saviynt.ssm.abstractConnector;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

 /**
 * The Class ConfigDataVo.
 */
public class ConfigDataVo implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The connection attributes. */
	private List<String> connectionAttributes = new ArrayList<String>();
	
	/** The encrypted connection attributes. */
	private	List<String> encryptedConnectionAttributes = new ArrayList<String>();
	
	/** The Connection attributes description. */
	private String ConnectionAttributesDescription = "";
	
	/** The connection attributes type. */
	private List<String> connectionAttributesType = new ArrayList<String>();
	
	/** The required connection attributes. */
	private List<String> requiredConnectionAttributes = new ArrayList<String>();
	
	/**
	 * Instantiates a new config data vo.
	 */
	public ConfigDataVo() {
	 	
		connectionAttributes.add("ECM_INSTANCE_URL");
		connectionAttributes.add("ECM_INSTANCE_SERVICE_ACCOUNT_NAME");
		connectionAttributes.add("ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD");
		connectionAttributes.add("ON_TASK_SUCCESS_JSON");
		requiredConnectionAttributes.add("ECM_INSTANCE_URL");
		requiredConnectionAttributes.add("ECM_INSTANCE_SERVICE_ACCOUNT_NAME");
		requiredConnectionAttributes.add("ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD");
	 	 
		connectionAttributes.add("STATUSKEYJSON");
		connectionAttributes.add("STATUS_THRESHOLD_CONFIG_JSON");
		ConnectionAttributesDescription=("{'ON_TASK_SUCCESS_JSON':'After Succes Update Task','ECM_INSTANCE_SERVICE_ACCOUNT_PASSWORD':'ECM Service Account Password','ECM_INSTANCE_SERVICE_ACCOUNT_NAME':'ECM Service Account User Name','ECM_INSTANCE_URL':'URL For ECM','STATUSKEYJSON':\"{'STATUS_ACTIVE':['1','ACTIVE','true','512'],'STATUS_INACTIVE':['0','INACTIVE','false','546','514']}\",'STATUS_THRESHOLD_CONFIG_JSON':\"{'statusAndThresholdConfig':{'statusColumn':'customproperty30','activeStatus': ['512','active'],'deleteLinks':true,'accountThresholdValue':1000,'correlateInactiveAccounts':false,'inactivateEntsNotInFeed':false,'inactivateAccountsNotInFile':false}}\"}");

	}

	

	/**
	 * Gets the connection attributes.
	 *
	 * @return the connection attributes
	 */
	public List<String> getConnectionAttributes() {
		return connectionAttributes;
	}

	/**
	 * Sets the connection attributes.
	 *
	 * @param connectionAttributes the new connection attributes
	 */
	public void setConnectionAttributes(List<String> connectionAttributes) {
		this.connectionAttributes = connectionAttributes;
	}

	/**
	 * Gets the encrypted connection attributes.
	 *
	 * @return the encrypted connection attributes
	 */
	public List<String> getEncryptedConnectionAttributes() {
		return encryptedConnectionAttributes;
	}

	/**
	 * Sets the encrypted connection attributes.
	 *
	 * @param encryptedConnectionAttributes the new encrypted connection attributes
	 */
	public void setEncryptedConnectionAttributes(List<String> encryptedConnectionAttributes) {
		this.encryptedConnectionAttributes = encryptedConnectionAttributes;
	}

	 

	/**
	 * Gets the connection attributes description.
	 *
	 * @return the connection attributes description
	 */
	public String getConnectionAttributesDescription() {
		return ConnectionAttributesDescription;
	}

	/**
	 * Sets the connection attributes description.
	 *
	 * @param connectionAttributesDescription the new connection attributes description
	 */
	public void setConnectionAttributesDescription(String connectionAttributesDescription) {
		ConnectionAttributesDescription = connectionAttributesDescription;
	}

	/**
	 * Gets the connection attributes type.
	 *
	 * @return the connection attributes type
	 */
	public List<String> getConnectionAttributesType() {
		return connectionAttributesType;
	}

	/**
	 * Sets the connection attributes type.
	 *
	 * @param connectionAttributesType the new connection attributes type
	 */
	public void setConnectionAttributesType(List<String> connectionAttributesType) {
		this.connectionAttributesType = connectionAttributesType;
	}

	/**
	 * Gets the required connection attributes.
	 *
	 * @return the required connection attributes
	 */
	public List<String> getRequiredConnectionAttributes() {
		return requiredConnectionAttributes;
	}

	/**
	 * Sets the required connection attributes.
	 *
	 * @param requiredConnectionAttributes the new required connection attributes
	 */
	public void setRequiredConnectionAttributes(List<String> requiredConnectionAttributes) {
		this.requiredConnectionAttributes = requiredConnectionAttributes;
	}

}
