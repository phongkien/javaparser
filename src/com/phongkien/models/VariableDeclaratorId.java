package com.phongkien.models;

public class VariableDeclaratorId {
	private String identifier;
	
	//TODO [], [][], etc
	private String dims;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getDims() {
		return dims;
	}

	public void setDims(String dims) {
		this.dims = dims;
	}
}
