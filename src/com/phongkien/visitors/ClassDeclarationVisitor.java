package com.phongkien.visitors;

import com.phongkien.Java8BaseVisitor;
import com.phongkien.Java8Parser;
import com.phongkien.Java8Parser.NormalClassDeclarationContext;
import com.phongkien.models.ClassDeclaration;

public class ClassDeclarationVisitor extends Java8BaseVisitor<ClassDeclaration> {
	public ClassDeclaration visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
		ClassDeclaration classDeclaration = null;

		NormalClassDeclarationContext normalClassDeclarationCtx = ctx.normalClassDeclaration();

		// visit class if there is any
		if (normalClassDeclarationCtx != null) {
			classDeclaration = normalClassDeclarationCtx.accept(new NormalClassDeclarationVisitor());
		}

		// TODO EnumClaration

		return classDeclaration;
	}
}
