package com.phongkien.visitors;

import com.phongkien.Java8BaseVisitor;
import com.phongkien.Java8Parser;
import com.phongkien.models.NormalClassDeclaration;

public class NormalClassDeclarationVisitor extends Java8BaseVisitor<NormalClassDeclaration>{
	public NormalClassDeclaration visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx)  {
		NormalClassDeclaration normalClassDeclaration = new NormalClassDeclaration();
		
		//get class name
		normalClassDeclaration.setIdentifier(ctx.Identifier().getText());
		
		//ctx.classModifier()
		
		return normalClassDeclaration;
	}
}
