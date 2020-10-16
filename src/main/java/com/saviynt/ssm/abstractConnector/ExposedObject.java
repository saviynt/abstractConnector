package com.saviynt.ssm.abstractConnector;

/**
 * The Enum ExposedObject.
 */
public enum ExposedObject {
	
	/** The users. */
	USERS("Users");

	/** The name. */
	private String name;

	/**
	 * Instantiates a new exposed object.
	 *
	 * @param name the name
	 */
	ExposedObject(String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
