package com.saviynt.ssm.abstractConnector;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * The Class AbstractFormatter.
 */
public class AbstractFormatter implements ApplicationContextAware {

	/** The application context. */
	public static ApplicationContext applicationContext = null;
	
	/** The saviynt read only object. */
	public static SaviyntReadOnlyObject saviyntReadOnlyObject;

	/**
	 * Sets the application context.
	 *
	 * @param applicationContextObj the new application context
	 * @throws BeansException the beans exception
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContextObj) throws BeansException {
		applicationContext = applicationContextObj;
		saviyntReadOnlyObject = applicationContextObj.getBean(SaviyntReadOnlyObject.class);

	}

	/**
	 * Format data.
	 *
	 * @param data the data
	 * @return the list
	 */
	public List<List<Map<String, Object>>> formatData(List<List<Map<String, Object>>> data) {

		return data;
	}

}
