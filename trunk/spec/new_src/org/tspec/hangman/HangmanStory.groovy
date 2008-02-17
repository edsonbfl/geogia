package org.tspec.hangman

import org.tspec.hangman.Hangman

เรื่อง 'คนแขวนคอ'

อธิบาย 'การตั้งค่าที่เหมาะสมสำหรับเริ่มต้น',{	
	กำหนดให้ 'มีวัตถุคนแขวนคอ', {
		hangman = new Hangman()
	}
	เมื่อ 'ตั้งค่าคำไว้เป็นค่า hello',{
		hangman.word = 'hello'
	}
	แล้ว 'ตัววัตถุควรมีการตั้งค่าที่เหมาะสม',{
		hangman.word.should == 'hello'		
		hangman.wrongs.should == 0
		hangman.maxGuess.should == 12
		hangman.unrevealedWord.should == ['_', '_', '_', '_', '_']
		hangman.finished.should == false		
	}
}

อธิบาย 'การตั้งค่าจำนวนครั้งที่เล่นผิดให้เป็น 0 ถ้าผู้เล่นต้องการเล่นเกมใหม่',{
	กำหนดให้ 'มีวัตถุคนแขวนคอ เพื่อเล่นคำว่า hello', {
		hangman = new Hangman()
		hangman.word = 'hello'
	}
	เมื่อ 'ผู้เล่นเล่นเกมไปแล้วด้วยการทาย a และสั่งให้เริ่มเกมใหม่', {
		playThenNewGame = {
			hangman.guess('a')
			hangman.newGame()
		}
	}
	แล้ว 'จำนวนครั้งของการเล่นผิดควรเป็น 0',{
		playThenNewGame()
		hangman.wrongs.should == 0
	}
}
