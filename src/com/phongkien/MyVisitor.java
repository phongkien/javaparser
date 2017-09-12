package com.phongkien;

import java.io.IOException;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyVisitor extends Java8BaseVisitor<Void> {

	static StringBuilder buffer;
	
	/**
	 * Main Method
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		CharStream input = CharStreams
				.fromPath(Paths.get("C:\\Users\\phongkien\\Vivify\\ANTLR4Test\\src\\com\\phongkien\\MyVisitor.java"));

		Java8Lexer lexer = new Java8Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Java8Parser parser = new Java8Parser(tokens);
		ParseTree tree = parser.compilationUnit(); // see the grammar ->
													// starting point for
													// parsing a java file

		MyVisitor visitor = new MyVisitor(); // extends JavaBaseVisitor<Void>
												// and overrides the methods
												// you're interested
		
		buffer = new StringBuilder();
		visitor.visit(tree);
		
		System.out.println(buffer.toString());
	}
	
//	public Void visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
//		System.out.println(ctx.getText());
//		return super.visitMethodDeclaration(ctx);
//	}
	
	public Void visitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
		TerminalNode identifier  = ctx.Identifier();
		
		if (identifier != null) {
			buffer.append(identifier.getText());
		}

		return super.visitMethodDeclarator(ctx);
	}
	
	public Void visitMethodModifier(Java8Parser.MethodModifierContext ctx) {
		buffer.append("\n" + ctx.getText() + " ");
		return super.visitMethodModifier(ctx);
	}
//	
//	public Void visitMethodHeader(Java8Parser.MethodHeaderContext ctx) {
//		//System.out.println("header: " + ctx.getText());
//		return super.visitMethodHeader(ctx);
//	}
}