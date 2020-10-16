package com.saviynt.ssm.abstractConnector.utility;

import java.io.StringWriter;
import java.util.Map;

import groovy.lang.Writable;
import groovy.text.SimpleTemplateEngine;

/**
 * The Class GroovyService.
 */
public class GroovyService {
	
	/** The Constant SIMPLE_TEMPLATE_ENGINE. */
	public static final SimpleTemplateEngine SIMPLE_TEMPLATE_ENGINE = new SimpleTemplateEngine();

	/**
	 * Convert template to string.
	 *
	 * @param text the text
	 * @param model the model
	 * @return the string
	 * @throws Exception the exception
	 */
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
