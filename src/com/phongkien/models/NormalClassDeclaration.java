package com.phongkien.models;

import com.phongkien.enums.ClassDeclarationType;

public class NormalClassDeclaration extends ClassDeclaration {
	// TODO typeParameters

	// TODO annotation and stuff
	private String superClass;

	public NormalClassDeclaration() {
		this.setClassDeclarationType(ClassDeclarationType.RegularClass);
	}

	public String getSuperClass() {
		return superClass;
	}

	public void setSuperClass(String superClass) {
		this.superClass = superClass;
	}
}
