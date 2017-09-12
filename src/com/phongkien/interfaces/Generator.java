package com.phongkien.interfaces;

public abstract class Generator {
	public abstract String generate(int startingTabCount);

	public void println(StringBuilder sb, int tabCount, String text) {
		for (int i = 0; i < tabCount; i++) {
			sb.append("    ");
		}

		sb.append(text);
	}
}
