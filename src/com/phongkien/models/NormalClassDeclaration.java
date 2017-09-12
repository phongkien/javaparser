package com.phongkien.models;

import java.util.ArrayList;
import java.util.List;

public class NormalClassDeclaration {
	private List<String> classModifier;
	private String identifier;
	
	//TODO typeParameters

	//TODO annotation and stuff
	private String superClass;
	
	//TODO annotation and stuff
	private List<String> interfaces;

	public List<String> getClassModifier() {
		return classModifier;
	}

	public void setClassModifier(List<String> classModifier) {
		this.classModifier = classModifier;
	}
	
	public void addClassModifier(String modifier) {
		if (this.classModifier == null) {
			this.classModifier = new ArrayList<String>();
		}
		
		this.classModifier.add(modifier);
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getSuperClass() {
		return superClass;
	}

	public void setSuperClass(String superClass) {
		this.superClass = superClass;
	}

	public List<String> getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(List<String> interfaces) {
		this.interfaces = interfaces;
	}
	
	public void addIdenterface(String interfaceName) {
		if (this.interfaces == null) {
			this.interfaces = new ArrayList<String>();
		}
		
		this.interfaces.add(interfaceName);
	}
}
