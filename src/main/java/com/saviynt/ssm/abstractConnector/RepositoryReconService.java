package com.saviynt.ssm.abstractConnector;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * The Class RepositoryReconService.
 */
public abstract class RepositoryReconService implements ApplicationContextAware {

	/** The application context. */
	public static ApplicationContext applicationContext = null;

	/**
	 * to set the application context.
	 *
	 * @param applicationContextObj the new application context
	 * @throws BeansException the beans exception
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContextObj) throws BeansException {
		applicationContext = applicationContextObj;

	}

	/**
	 * to Update repositary.
	 *
	 * @param data the data
	 * @param endpoints the endpoints
	 * @param formatterClass the formatter class
	 * @param dataFromSSM the data from SSM
	 * @throws Exception the exception
	 */
	public abstract void updateRepositary(List<List<Map<String, Object>>> data, Long endpoints, String formatterClass,Map<String,Object> dataFromSSM)
			throws Exception;

	/**
	 * to Notify for recon process
	 *
	 * @param data the data
	 * @param endpointId the endpoint id
	 * @param formatterClass the formatter class
	 * @param dataFromSSM the data from SSM
	 * @throws Exception the exception
	 */
	public static void notify(List<List<Map<String, Object>>> data, Long endpointId, String formatterClass,Map<String,Object> dataFromSSM)
			throws Exception {
		RepositoryReconService reconService = applicationContext.getBean(RepositoryReconService.class);
		reconService.updateRepositary(data, endpointId, formatterClass,dataFromSSM);

	}

	 
	/**
	 * to get the last run date from accounts.
	 *
	 * @param incrField the incr field
	 * @return the last run date from accounts
	 * @throws Exception the exception
	 */
	public abstract Date getLastRunDateFromAccounts(String incrField) throws Exception;

	/**
	 * to get the last run date.
	 *
	 * @param incrField the incr field
	 * @return the last run date
	 * @throws Exception the exception
	 */
	public static Date getLastRunDate(String incrField) throws Exception {
		RepositoryReconService reconService = applicationContext.getBean(RepositoryReconService.class);
		return reconService.getLastRunDateFromAccounts(incrField);
	}
}
