package com.phongkien.visitors;

import com.phongkien.Java8BaseVisitor;
import com.phongkien.Java8Parser;
import com.phongkien.models.ClassDeclaration;

public class ClassVisitor extends Java8BaseVisitor<ClassDeclaration> {
	public ClassDeclaration visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
		ClassDeclaration classDeclaration = new ClassDeclaration();
		
		//TODO EnumClaration
		
		return classDeclaration;
	}
}
