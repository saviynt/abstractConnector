package com.saviynt.ssm.abstractConnector;

import java.io.Serializable;
import java.util.Map;

import com.saviynt.ssm.abstractConnector.exceptions.ConnectorException;

public abstract class BaseConnectorSpecification implements Serializable, BaseConnector {

	private static final long serialVersionUID = 1L;

	@Override
	public Boolean isPremises() {
		return true;
	}

	@Override
	public final ConfigDataVo getConfig() {
		ConfigDataVo configData = new ConfigDataVo();
		setConfig(configData);
		return configData;
	}

	@Override
	public String getLogonIdAndSessionIdByClientName(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		throw new ConnectorException("Not Implemented");
	}

	@Override
	public Boolean getLogoffBySessionId(Map<String, Object> configData, Map<String, Object> data)
			throws ConnectorException {
		throw new ConnectorException("Not Implemented");
	}

	@Override
	public Boolean getLogOffDiscSessions(Map<String, Object> configData) throws ConnectorException {
		throw new ConnectorException("Not Implemented");
	}

}
