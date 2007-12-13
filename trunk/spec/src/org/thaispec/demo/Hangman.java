package org.thaispec.demo;

import org.thaispec.Thai;

@Thai("คนแขวนคอ")
public class Hangman {
	
	@Thai("คำ")	
	private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	@Thai("ลอง")
	public void doTry(String a) {
		// TODO
	}

}
