package com.saviynt.ssm.abstractConnector;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class RepositoryReconService implements ApplicationContextAware {

	public static ApplicationContext applicationContext = null;

	@Override
	public void setApplicationContext(ApplicationContext applicationContextObj) throws BeansException {
		applicationContext = applicationContextObj;

	}

	public abstract void updateRepositary(List<List<Map<String, Object>>> data, Long endpoints, String formatterClass,Map<String,Object> dataFromSSM)
			throws Exception;

	public static void notify(List<List<Map<String, Object>>> data, Long endpointId, String formatterClass,Map<String,Object> dataFromSSM)
			throws Exception {
		RepositoryReconService reconService = applicationContext.getBean(RepositoryReconService.class);
		reconService.updateRepositary(data, endpointId, formatterClass,dataFromSSM);

	}

	 
	public abstract Date getLastRunDateFromAccounts(String incrField) throws Exception;

	public static Date getLastRunDate(String incrField) throws Exception {
		RepositoryReconService reconService = applicationContext.getBean(RepositoryReconService.class);
		return reconService.getLastRunDateFromAccounts(incrField);
	}
}
