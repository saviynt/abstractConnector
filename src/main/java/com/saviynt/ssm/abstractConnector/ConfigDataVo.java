package com.saviynt.ssm.abstractConnector;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConfigDataVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<String> connectionAttributes = new ArrayList<String>();
	private	List<String> encryptedConnectionAttributes = new ArrayList<String>();
	private String ConnectionAttributesDescription = "";
	private List<String> connectionAttributesType = new ArrayList<String>();
	private List<String> requiredConnectionAttributes = new ArrayList<String>();
	
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

	

	public List<String> getConnectionAttributes() {
		return connectionAttributes;
	}

	public void setConnectionAttributes(List<String> connectionAttributes) {
		this.connectionAttributes = connectionAttributes;
	}

	public List<String> getEncryptedConnectionAttributes() {
		return encryptedConnectionAttributes;
	}

	public void setEncryptedConnectionAttributes(List<String> encryptedConnectionAttributes) {
		this.encryptedConnectionAttributes = encryptedConnectionAttributes;
	}

	 

	public String getConnectionAttributesDescription() {
		return ConnectionAttributesDescription;
	}

	public void setConnectionAttributesDescription(String connectionAttributesDescription) {
		ConnectionAttributesDescription = connectionAttributesDescription;
	}

	public List<String> getConnectionAttributesType() {
		return connectionAttributesType;
	}

	public void setConnectionAttributesType(List<String> connectionAttributesType) {
		this.connectionAttributesType = connectionAttributesType;
	}

	public List<String> getRequiredConnectionAttributes() {
		return requiredConnectionAttributes;
	}

	public void setRequiredConnectionAttributes(List<String> requiredConnectionAttributes) {
		this.requiredConnectionAttributes = requiredConnectionAttributes;
	}

}
