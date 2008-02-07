package org.geogia.xmi;


import groovyjarjarantlr.RecognitionException;
import groovyjarjarantlr.TokenStreamException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.StringReader;

import org.codehaus.groovy.antlr.SourceBuffer;
import org.codehaus.groovy.antlr.UnicodeEscapingReader;
import org.codehaus.groovy.antlr.parser.GroovyLexer;
import org.codehaus.groovy.antlr.parser.GroovyRecognizer;
import org.codehaus.groovy.antlr.treewalker.SourceCodeTraversal;


public class GroovyPrettyPrinter {	
	
	public GroovyPrettyPrinter(String s, File file) throws RecognitionException, TokenStreamException, FileNotFoundException {
		GroovyRecognizer parser = null;
        SourceBuffer sourceBuffer = new SourceBuffer();
        UnicodeEscapingReader unicodeReader = new UnicodeEscapingReader(new StringReader(s),sourceBuffer);
        GroovyLexer lexer = new GroovyLexer(unicodeReader);
        unicodeReader.setLexer(lexer);
        parser = GroovyRecognizer.make(lexer);
        parser.setSourceBuffer(sourceBuffer);		
        String[] tokenNames = parser.getTokenNames();
		parser.compilationUnit();		
		NewSourcePrinter v = new NewSourcePrinter(new PrintStream(file), tokenNames, true);
		SourceCodeTraversal treewalker = new SourceCodeTraversal(v);		 
		treewalker.process(parser.getAST());		
	}

}
