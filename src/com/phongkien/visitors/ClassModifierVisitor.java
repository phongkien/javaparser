package com.phongkien.visitors;

import com.phongkien.Java8BaseVisitor;
import com.phongkien.Java8Parser;

public class ClassModifierVisitor extends Java8BaseVisitor<String> {
	public String visitClassModifier(Java8Parser.ClassModifierContext ctx) {
		return ctx.getText();
	}
}
