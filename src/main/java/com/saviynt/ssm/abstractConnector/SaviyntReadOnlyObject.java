package com.saviynt.ssm.abstractConnector;

import java.util.List;
import java.util.Map;

/**
 * The Class SaviyntReadOnlyObject.
 */
public abstract class SaviyntReadOnlyObject {

	/**
	 * Gets the object list.
	 *
	 * @param sObject the s object
	 * @param filter the filter
	 * @param firstResult the first result
	 * @param maxResult the max result
	 * @return the object list
	 */
	@SuppressWarnings("rawtypes")
	public abstract List getObjectList(ExposedObject sObject,Map<String, Object> filter,Integer firstResult,Integer maxResult);
	
}
