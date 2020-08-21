package com.saviynt.ssm.abstractConnector.utility;

import java.io.StringWriter;
import java.util.Map;

import groovy.lang.Writable;
import groovy.text.SimpleTemplateEngine;

public class GroovyService {
	public static final SimpleTemplateEngine SIMPLE_TEMPLATE_ENGINE = new SimpleTemplateEngine();

	public static String convertTemplateToString(String text, Map<String, Object> model) throws Exception {
		if (text == null) {
			return null;
		} else {
			Writable writable = SIMPLE_TEMPLATE_ENGINE.createTemplate(text).make(model);
			StringWriter result = new StringWriter();
			writable.writeTo(result);
			return result.toString();
		}

	}
	
}
