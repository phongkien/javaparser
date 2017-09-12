package com.phongkien.models;

import com.phongkien.enums.ClassDeclarationType;

public class NormalClassDeclaration extends ClassDeclaration {
	// TODO typeParameters

	// TODO annotation and stuff
	private String superClass;

	public NormalClassDeclaration() {
		this.setClassDeclarationType(ClassDeclarationType.Class);
	}

	public String getSuperClass() {
		return superClass;
	}

	public void setSuperClass(String superClass) {
		this.superClass = superClass;
	}

	public String generate(int startingTabCount) {
		StringBuilder sb = new StringBuilder();

		// ignore class modifier
		// TODO service, component, etc
		switch (this.getObjectType()) {
		case Function:
			// TODO need parameters
			// this.println(sb, 0, "export function " + this.getIdentifier());
			break;
		case Component:
			break;
		case Service:
			// TODO add Injectable import
			this.println(sb, 0, "@Injectable()");
			break;
		default:
			this.println(sb, 0, "export class " + this.getIdentifier() + this.superClassDeclaration()
					+ this.superInterfaceDeclaration() + " {");
			
			//TODO class body
			this.println(sb, 0, "}");
			break;
		}

		return sb.toString();
	}

	private String superClassDeclaration() {
		// TODO
		return "";
	}

	private String superInterfaceDeclaration() {
		// TODO
		return "";
	}
}
