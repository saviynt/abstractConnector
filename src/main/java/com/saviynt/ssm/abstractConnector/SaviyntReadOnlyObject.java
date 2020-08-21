package com.saviynt.ssm.abstractConnector;

import java.util.List;
import java.util.Map;

public abstract class SaviyntReadOnlyObject {

	@SuppressWarnings("rawtypes")
	public abstract List getObjectList(ExposedObject sObject,Map<String, Object> filter,Integer firstResult,Integer maxResult);
	
}
