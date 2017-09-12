package com.phongkien.generators;

import java.util.List;

import com.phongkien.models.ClassDeclaration;
import com.phongkien.models.JavaObjectDeclaration;
import com.phongkien.models.TypeDeclaration;

public class TypeScriptGenerator extends Generator {
	private JavaObjectDeclaration javaObjectDeclaration;

	public TypeScriptGenerator(JavaObjectDeclaration jo) {
		this.javaObjectDeclaration = jo;
	}

	public String generate(int startingTabCount) {
		StringBuilder classBuilder = new StringBuilder();

		// generate class declaration
		StringBuilder bodyBuilder = new StringBuilder();
		this.generateTypeDeclarations(bodyBuilder, this.javaObjectDeclaration.getTypeDeclarations(), startingTabCount);
		this.println(classBuilder, 0, bodyBuilder.toString());

		// TODO generate imports
		return classBuilder.toString();
	}

	public void generateTypeDeclarations(StringBuilder sb, List<TypeDeclaration> typeDeclarations,
			int startingTabCount) {
		// imports

		// declarations
		if (typeDeclarations != null && typeDeclarations.size() > 0) {
			typeDeclarations.forEach(td -> this.generateTypeDeclaration(sb, td, startingTabCount));
		}
	}

	public void generateTypeDeclaration(StringBuilder sb, TypeDeclaration typeDeclaration, int startingTabCount) {
		if (typeDeclaration instanceof ClassDeclaration) {
			this.generateClassDeclaration(sb, (ClassDeclaration) typeDeclaration, startingTabCount);
		}
	}

	public void generateClassDeclaration(StringBuilder sb, ClassDeclaration classDeclaration, int startingTabCount) {
		// ignore class modifier
		// TODO service, component, etc
		switch (classDeclaration.getObjectType()) {
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
			this.println(sb, 0,
					"export class " + classDeclaration.getIdentifier() + this.superClassDeclaration(classDeclaration)
							+ this.superInterfaceDeclaration(classDeclaration) + " {");

			// TODO class body
			this.println(sb, 0, "}");
			break;
		}
	}

	private String superClassDeclaration(ClassDeclaration classDeclaration) {
		// TODO
		return "";
	}

	private String superInterfaceDeclaration(TypeDeclaration typeDeclaration) {
		// TODO
		return "";
	}
}
