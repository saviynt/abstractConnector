package com.saviynt.ssm.abstractConnector;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AbstractFormatter implements ApplicationContextAware {

	public static ApplicationContext applicationContext = null;
	public static SaviyntReadOnlyObject saviyntReadOnlyObject;

	@Override
	public void setApplicationContext(ApplicationContext applicationContextObj) throws BeansException {
		applicationContext = applicationContextObj;
		saviyntReadOnlyObject = applicationContextObj.getBean(SaviyntReadOnlyObject.class);

	}

	public List<List<Map<String, Object>>> formatData(List<List<Map<String, Object>>> data) {

		return data;
	}

}
