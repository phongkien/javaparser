package com.phongkien.visitors;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.phongkien.Java8BaseVisitor;
import com.phongkien.Java8Parser;
import com.phongkien.Java8Parser.ImportDeclarationContext;
import com.phongkien.Java8Parser.PackageDeclarationContext;
import com.phongkien.Java8Parser.TypeDeclarationContext;
import com.phongkien.models.JavaObjectDeclaration;

public class CompilationUnitVisitor extends Java8BaseVisitor<JavaObjectDeclaration> {
	public JavaObjectDeclaration visitCompilationUnit(Java8Parser.CompilationUnitContext ctx) {
		JavaObjectDeclaration javaObject = new JavaObjectDeclaration();

		// package dec
		PackageDeclarationContext packageDeclarationCtx = ctx.packageDeclaration();

		if (packageDeclarationCtx != null) {
			javaObject.setPackageDeclaration(packageDeclarationCtx.getText());
		}

		// imports dec
		List<ImportDeclarationContext> importDeclarationCtxs = ctx.importDeclaration();

		if (importDeclarationCtxs != null && importDeclarationCtxs.size() > 0) {
			ImportDeclarationVisitor importDeclarationVisitor = new ImportDeclarationVisitor();
			javaObject.setImportDeclarations(
					importDeclarationCtxs.stream().map(id -> id.accept(importDeclarationVisitor)).collect(toList()));
		}

		// type dec
		List<TypeDeclarationContext> typeDeclarations = ctx.typeDeclaration();
		if (typeDeclarations != null && typeDeclarations.size() > 0) {
			TypeDeclarationVisitor typeDeclarationVisitor = new TypeDeclarationVisitor();
			javaObject.setTypeDeclarations(
					typeDeclarations.stream().map(td -> td.accept(typeDeclarationVisitor)).collect(toList()));
		}

		return javaObject;
	}
}
