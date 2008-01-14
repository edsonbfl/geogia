package org.hyperform.parser;

import org.antlr.runtime.ANTLRFileStream;

public class ParserHelper {

	public static boolean hasComment(ANTLRFileStream cb) throws Exception {
		return (cb.LA(1) == '(' && cb.LA(2) == '*')
				|| (cb.LA(1) == '!' && cb.LA(2) == ' ');
	}

	public static boolean hasWhiteSpace(ANTLRFileStream cb) throws Exception {
		int ch = cb.LA(1);
		return // (ch == '\r' || ch == '\n' ||
		ch == ' ' || ch == '\t';
	}

	public static void consumeComment(ANTLRFileStream cb) throws Exception {
		if (cb.LA(1) == '(' && cb.LA(2) == '*') {
			cb.consume(); // (
			cb.consume(); // *
			while (cb.LA(1) != '*' && cb.LA(2) != ')') {
				cb.consume();
			}
			cb.consume(); // *
			cb.consume(); // )
		}
	}

	public static void consumeLineComment(ANTLRFileStream cb) throws Exception {
		if (cb.LA(1) == '!' && cb.LA(2) == ' ') {
			cb.consume(); // /
			cb.consume(); // /
			while (cb.LA(1) != '\n') {
				cb.consume();
			}
			cb.consume(); // \n
		}
	}

	public static void consumeWhiteSpace(ANTLRFileStream cb) throws Exception {
		boolean stop = false;
		while (!stop) {
			int ch = cb.LA(1);
			switch (ch) {
			case '\r':
			case '\n':
			case ' ':
			case '\t': {
				cb.consume();
				break;
			}
			default:
				stop = true;
			}
		}
	}

}
