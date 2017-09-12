package com.phongkien.parsers;

import java.io.IOException;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.phongkien.Java8Lexer;
import com.phongkien.Java8Parser;
import com.phongkien.generators.TypeScriptGenerator;
import com.phongkien.models.JavaObjectDeclaration;
import com.phongkien.visitors.CompilationUnitVisitor;

public class JavaParser {

	/**
	 * Main Method
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		CharStream input = CharStreams.fromPath(
				Paths.get("C:\\Users\\phongkien\\Vivify\\ANTLR4Test\\src\\com\\phongkien\\test\\BasicClass.java"));

		Java8Lexer lexer = new Java8Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Java8Parser parser = new Java8Parser(tokens);

		CompilationUnitVisitor visitor = new CompilationUnitVisitor();
		JavaObjectDeclaration jo = visitor.visit(parser.compilationUnit());

		TypeScriptGenerator tsg = new TypeScriptGenerator(jo);
		System.out.println(tsg.generate(0));
	}
}