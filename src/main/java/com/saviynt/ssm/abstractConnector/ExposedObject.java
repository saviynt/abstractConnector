package com.saviynt.ssm.abstractConnector;

public enum ExposedObject {
	USERS("Users");

	private String name;

	ExposedObject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
