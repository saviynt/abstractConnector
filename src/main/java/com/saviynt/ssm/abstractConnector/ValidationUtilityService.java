package com.saviynt.ssm.abstractConnector;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.saviynt.ssm.abstractConnector.exceptions.ConnectorException;

/**
 * The Class ValidationUtilityService.
 */
public abstract class ValidationUtilityService implements ApplicationContextAware {

	/** The application context. */
	public static ApplicationContext applicationContext = null;

	/**
	 * purpose: to set the application context.
	 *
	 * @param applicationContextObj the new application context
	 * @throws BeansException the beans exception
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContextObj) throws BeansException {
		applicationContext = applicationContextObj;

	}
	
	/**
	 * purpose: to validate tasks.
	 *
	 * @param data the data
	 * @return true, if successful
	 * @throws ConnectorException the connector exception
	 */
	public abstract boolean validateTasks(Map<String,Object> data) throws ConnectorException;
	
	/**
	 * purpose: to validate acc tasks.
	 *
	 * @param data the data
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	public static boolean validateAccTasks(Map<String,Object> data)
			throws Exception {
		ValidationUtilityService validateService = applicationContext.getBean(ValidationUtilityService.class);
		return validateService.validateTasks(data);

	}

}
