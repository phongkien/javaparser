package com.phongkien.visitors;

import com.phongkien.Java8BaseVisitor;
import com.phongkien.Java8Parser;
import com.phongkien.Java8Parser.ClassDeclarationContext;
import com.phongkien.models.TypeDeclaration;

public class TypeDeclarationVisitor extends Java8BaseVisitor<TypeDeclaration> {
	public TypeDeclaration visitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx) {
		TypeDeclaration typeDeclaration = null;
		
		ClassDeclarationContext classDeclarationCtx = ctx.classDeclaration();
		
		if (classDeclarationCtx != null) {
			typeDeclaration = classDeclarationCtx.accept(new ClassDeclarationVisitor());
		}
		
		//TODO interfaceDeclartion
		
		return typeDeclaration;
	}
}
