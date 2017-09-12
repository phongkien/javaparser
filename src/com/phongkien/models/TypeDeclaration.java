package com.phongkien.models;

import com.phongkien.interfaces.Generator;

public class TypeDeclaration extends Generator {

	@Override
	public String generate(int startingTabCount) {
		return "";
	}

	public String toString() {
		return this.generate(0);
	}
}
