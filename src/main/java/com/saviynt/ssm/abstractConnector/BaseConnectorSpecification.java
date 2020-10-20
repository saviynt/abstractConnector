package com.saviynt.ssm.abstractConnector;

import java.io.Serializable;
import java.util.Map;

import com.saviynt.ssm.abstractConnector.exceptions.ConnectorException;
import com.saviynt.ssm.abstractConnector.exceptions.InvalidAttributeValueException;
import com.saviynt.ssm.abstractConnector.exceptions.InvalidCredentialException;
import com.saviynt.ssm.abstractConnector.exceptions.MissingKeyException;
import com.saviynt.ssm.abstractConnector.exceptions.OperationTimeoutException;

/**
 * The Class BaseConnectorSpecification.
 */
public abstract class BaseConnectorSpecification implements Serializable, BaseConnector {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * to check if is premises
	 *
	 * @return the boolean
	 */
	@Override
	public Boolean isPremises() {
		return true;
	}

	/**
	 * to get the config.
	 *
	 * @return the config
	 */
	@Override
	public final ConfigDataVo getConfig() {
		ConfigDataVo configData = new ConfigDataVo();
		setConfig(configData);
		return configData;
	}

	/**
	 * to get the logon id and session id by client name.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the logon id and session id by client name
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public String getLogonIdAndSessionIdByClientName(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		throw new ConnectorException("Not Implemented");
	}

	/**
	 * to get the logoff by session id.
	 *
	 * @param configData the config data
	 * @param data the data
	 * @return the logoff by session id
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean getLogoffBySessionId(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		throw new ConnectorException("Not Implemented");
	}

	/**
	 * to gets the log off disc sessions.
	 *
	 * @param configData the config data
	 * @return the log off disc sessions
	 * @throws ConnectorException the connector exception
	 */
	@Override
	public Boolean getLogOffDiscSessions(Map<String, Object> configData) throws ConnectorException {
		throw new ConnectorException("Not Implemented");
	}




}
