package com.phongkien.models;

import java.util.ArrayList;
import java.util.List;

public class JavaObjectDeclaration {
	private String packageDeclaration;
	private List<String> importDeclarations;
	private List<TypeDeclaration> typeDeclarations;

	public String getPackageDeclaration() {
		return packageDeclaration;
	}

	public void setPackageDeclaration(String packageDeclaration) {
		this.packageDeclaration = packageDeclaration;
	}

	public List<String> getImportDeclarations() {
		return importDeclarations;
	}

	public void setImportDeclarations(List<String> importDeclarations) {
		this.importDeclarations = importDeclarations;
	}

	public void addImport(String importString) {
		if (this.importDeclarations == null) {
			this.importDeclarations = new ArrayList<>();
		}

		this.importDeclarations.add(importString);
	}

	public List<TypeDeclaration> getTypeDeclarations() {
		return typeDeclarations;
	}

	public void setTypeDeclarations(List<TypeDeclaration> typeDeclarations) {
		this.typeDeclarations = typeDeclarations;
	}
}
