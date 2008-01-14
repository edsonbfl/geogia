package org.hyperform.parser;

import org.antlr.runtime.ANTLRFileStream;

public abstract class Parser {
	
	protected String filename;
	protected ANTLRFileStream cb;
	
	public Parser(String filename) throws Exception {
		this.filename = filename;
		this.cb = new ANTLRFileStream(filename);
	}
			
	protected abstract void cleanUp() throws Exception ;
	
	protected boolean LA(int token) throws Exception {
		cleanUp();
		return token==cb.LA(1);		
	}
	
	protected boolean LA(String token) throws Exception {
		cleanUp();
		for (int i = 0; i < token.length(); i++) {
			if (token.charAt(i) == cb.LA(i + 1)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
	
	protected boolean $q(int token) throws Exception {
		if(LA(token)) {
			$(token);
			return true;
		} else {
			return false;
		}
	}	
	
	protected boolean $q(String token) throws Exception {
		if(LA(token)) {
			$(token);
			return true;
		} else {
			return false;
		}
	}
	
	protected void $(int token) throws Exception {
		cleanUp();
		if (token == cb.LA(1)) {
			cb.consume();
		} else {
			throw new Exception("expectd '" + (char)token + "' found "
					+ (char) cb.LA(1) + "(" + cb.LA(1) + ")" + " at "
					+ cb.getLine() + ":" + (cb.getCharPositionInLine() + 1)
					+ " in " + this.filename);			
		}
		//cleanUp();		
	}
	
	protected void $(String token) throws Exception {
		cleanUp();
		for (int i = 0; i < token.length(); i++) {
			if (token.charAt(i) == cb.LA(1)) {
				cb.consume();
				continue;
			} else {
				throw new Exception("expectd '" + token + "' found "
						+ (char) cb.LA(1) + "(" + cb.LA(1) + ")" + " at "
						+ cb.getLine() + ":" + (cb.getCharPositionInLine() + 1)
						+ " in " + this.filename);
			}
		}
		//cleanUp();		
	}	

}
