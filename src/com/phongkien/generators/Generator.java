package com.phongkien.generators;

import java.util.List;

import com.phongkien.models.TypeDeclaration;
import com.phongkien.utils.CommonUtils;

public abstract class Generator {
	public abstract String generate(int startingTabCount);

	public abstract void generateTypeDeclarations(StringBuilder sb, List<TypeDeclaration> typeDeclarations,
			int startingTabCount);

	public abstract void generateTypeDeclaration(StringBuilder sb, TypeDeclaration typeDeclaration,
			int startingTabCount);

	public void println(StringBuilder sb, int tabCount, String text) {
		for (int i = 0; i < tabCount; i++) {
			sb.append(CommonUtils.TAB_COUNT);
		}

		sb.append(text + CommonUtils.NEW_LINE);
	}
}
