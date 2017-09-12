package com.phongkien.visitors;

import java.util.stream.Collectors;

import com.phongkien.Java8BaseVisitor;
import com.phongkien.Java8Parser;
import com.phongkien.models.NormalClassDeclaration;

public class NormalClassDeclarationVisitor extends Java8BaseVisitor<NormalClassDeclaration> {
	public NormalClassDeclaration visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
		NormalClassDeclaration normalClassDeclaration = new NormalClassDeclaration();

		// class modifiers
		ClassModifierVisitor classModifierVisitor = new ClassModifierVisitor();
		normalClassDeclaration.setModifiers(
				ctx.classModifier().stream().map(cm -> cm.accept(classModifierVisitor)).collect(Collectors.toList()));

		// get class name/identifier
		normalClassDeclaration.setIdentifier(ctx.Identifier().getText());

		// TODO typeParameters

		// TODO super class

		// TODO super interfaces

		// TODO classBody

		return normalClassDeclaration;
	}
}
