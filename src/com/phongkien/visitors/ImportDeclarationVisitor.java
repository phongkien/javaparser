package com.phongkien.visitors;

import com.phongkien.Java8BaseVisitor;
import com.phongkien.Java8Parser;

public class ImportDeclarationVisitor extends Java8BaseVisitor<String> {
	public String visitImportDeclaration(Java8Parser.ImportDeclarationContext ctx) { 
		return ctx.getText();
	}
}
