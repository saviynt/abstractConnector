package com.saviynt.ssm.abstractConnector;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.saviynt.ssm.abstractConnector.exceptions.ConnectorException;

public abstract class ValidationUtilityService implements ApplicationContextAware {

	public static ApplicationContext applicationContext = null;

	@Override
	public void setApplicationContext(ApplicationContext applicationContextObj) throws BeansException {
		applicationContext = applicationContextObj;

	}
	
	public abstract boolean validateTasks(Map<String,Object> data) throws ConnectorException;
	
	public static boolean validateAccTasks(Map<String,Object> data)
			throws Exception {
		ValidationUtilityService validateService = applicationContext.getBean(ValidationUtilityService.class);
		return validateService.validateTasks(data);

	}

}
