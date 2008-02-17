package org.tspec.hangman;

import java.util.ArrayList;
import java.util.List;

public class Hangman {
	
	private String word;
	private int wrongs;
	private int maxGuess;
	private List<String> unrevealedWord;
	private boolean finished;
	
	public boolean isFinished() {
		return finished;
	}

	public List<String> getUnrevealedWord() {
		return unrevealedWord;
	}

	public int getMaxGuess() {
		return maxGuess;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
		unrevealedWord = new ArrayList<String>();
		for(int i=0;i<word.length();i++) {
			unrevealedWord.add("_");
		}
		this.maxGuess = 12;
	}

	public int getWrongs() {
		return wrongs;
	}
	
	public void guess(String ch) {
		if(this.word.indexOf(ch)==-1) {
			wrongs++;
		} else {
			// TODO correct it
		}
	}
	
	public void newGame() {
		this.wrongs = 0;
	}

}
