package com.phongkien.models;

import java.util.ArrayList;
import java.util.List;

import com.phongkien.enums.ClassDeclarationType;
import com.phongkien.enums.TypeScriptObjectType;

public class ClassDeclaration extends TypeDeclaration {
	private TypeScriptObjectType objectType = TypeScriptObjectType.Default;
	private List<String> modifiers;
	private ClassDeclarationType classDeclarationType;
	private String identifier;

	// TODO annotation and stuff
	private List<String> interfaces;

	// TODO body

	public void addModifier(String modifier) {
		if (this.modifiers == null) {
			this.modifiers = new ArrayList<>();
		}

		this.modifiers.add(modifier);
	}

	public List<String> getModifiers() {
		return modifiers;
	}

	public void setModifiers(List<String> modifiers) {
		this.modifiers = modifiers;
	}

	public ClassDeclarationType getClassDeclarationType() {
		return classDeclarationType;
	}

	public void setClassDeclarationType(ClassDeclarationType classDeclarationType) {
		this.classDeclarationType = classDeclarationType;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public List<String> getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(List<String> interfaces) {
		this.interfaces = interfaces;
	}

	public void addInterface(String interfaceName) {
		if (this.interfaces == null) {
			this.interfaces = new ArrayList<>();
		}

		this.interfaces.add(interfaceName);
	}

	public TypeScriptObjectType getObjectType() {
		return objectType;
	}

	public void setObjectType(TypeScriptObjectType objectType) {
		this.objectType = objectType;
	}
}
